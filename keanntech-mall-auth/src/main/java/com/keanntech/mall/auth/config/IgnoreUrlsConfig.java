package com.keanntech.mall.auth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "ignored")
@EnableConfigurationProperties(IgnoreUrlsConfig.class)
public class IgnoreUrlsConfig {

    private List<String> authUrls = new ArrayList<>();

    public void setAuthUrls(List<String> urls) {
        this.authUrls = urls;
    }

    public List<String> getAuthUrls() {
        return this.authUrls;
    }

}
