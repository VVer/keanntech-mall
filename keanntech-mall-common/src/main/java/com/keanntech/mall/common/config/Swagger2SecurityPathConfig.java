package com.keanntech.mall.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "swagger2")
@EnableConfigurationProperties(Swagger2SecurityPathConfig.class)
public class Swagger2SecurityPathConfig {

    private List<String> securityPath = new ArrayList<>();

    public List<String> getSecurityPath() {
        return securityPath;
    }

    public void setSecurityPath(List<String> securityPath) {
        this.securityPath = securityPath;
    }
}
