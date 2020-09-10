package com.keanntech.mall.admin.controller;

import cn.hutool.http.HttpUtil;
import com.google.gson.Gson;
import com.keanntech.mall.admin.dto.SysAdminParams;
import com.keanntech.mall.admin.dto.SysMenuParams;
import com.keanntech.mall.admin.service.SysAdminService;
import com.keanntech.mall.admin.service.SysMenuService;
import com.keanntech.mall.admin.util.AdminUtil;
import com.keanntech.mall.common.GlobalConstant;
import com.keanntech.mall.common.api.CommonResult;
import com.keanntech.mall.common.api.ResultCode;
import com.keanntech.mall.mbg.model.SysAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "AdminController", tags = {"登录接口"})
@RequestMapping("/admin")
@RestController
public class SysAdminController {

    @Value("${jwt.tokenHeader:Authorization}")
    private String tokenHeader;
    @Value("${jwt.tokenHead:Bearer}")
    private String tokenHead;

    @Autowired
    SysAdminService sysAdminService;

    @Autowired
    SysMenuService sysMenuService;

    @ApiOperation(value = "登录成功后返回token")
    @PostMapping("/login")
    @ResponseBody
    public CommonResult login(@RequestBody @Validated SysAdminParams sysAdminParams, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Gson errJson = new Gson();
            String strErrJson = errJson.toJson(bindingResult.getAllErrors());
            return CommonResult.failed(ResultCode.VALIDATE_FAILED, strErrJson);
        }
        String token = null;
        try {
            token = sysAdminService.login(sysAdminParams.getUsername(), sysAdminParams.getPassword());
            if (StringUtils.isEmpty(token)) {
                return CommonResult.validateFailed("用户名或密码错误");
            }
        } catch (BadCredentialsException | UsernameNotFoundException e) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "微信登录，登录成功后返回TOKEN")
    @GetMapping("/weixinlogin")
    public CommonResult weixinlogin(@RequestParam String code){
        Map<String, Object> params = new HashMap<>();
        params.put("js_code", code);
        params.put("appid", GlobalConstant.WX_APPID);
        params.put("secret", GlobalConstant.WX_SECRET);
        params.put("grant_type", GlobalConstant.WX_GRANT_TYPE);
        String result = HttpUtil.get(GlobalConstant.WX_GET_OPENID_URL, params);
        Map<String, String> data = new HashMap<>();
        data.put("data",result);
        return CommonResult.success(data);
    }

    @ApiOperation(value = "退出登录")
    @GetMapping("/loginOut")
    public CommonResult loginOut() {
        return CommonResult.success(null);
    }

    @ApiOperation(value = "获取当前登录用户")
    @GetMapping("/getCurrentAdminInfo")
    public CommonResult getCurrentAdminInfo() {
        SysAdmin sysAdmin = AdminUtil.getCurrentAdmin();
        List<SysMenuParams> menuTree = sysMenuService.getMenuTree(sysAdmin.getId());
        Map<String, Object> data = new HashMap<>(4);
        data.put("username", sysAdmin.getUsername());
        data.put("id", sysAdmin.getId());
        data.put("portrait", sysAdmin.getPortrait());
        data.put("menus", menuTree);
        return CommonResult.success(data);
    }
}
