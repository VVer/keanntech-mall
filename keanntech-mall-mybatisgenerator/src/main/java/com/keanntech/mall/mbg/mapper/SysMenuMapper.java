package com.keanntech.mall.mbg.mapper;

import com.keanntech.mall.mbg.model.SysMenu;
import com.keanntech.mall.mbg.model.SysMenuExample;
import com.keanntech.mall.mbg.model.SysMenuKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    long countByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int deleteByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int deleteByPrimaryKey(SysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    SysMenu selectByPrimaryKey(SysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbg.generated Wed Jul 08 22:37:14 CST 2020
     */
    int updateByPrimaryKey(SysMenu record);
}
