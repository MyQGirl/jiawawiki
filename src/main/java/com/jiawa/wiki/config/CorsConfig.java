package com.jiawa.wiki.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //表示针对所有的请求地址
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedHeaders(CorsConfiguration.ALL)
                .allowedMethods(CorsConfiguration.ALL)
                .allowCredentials(true)
                //在调用电子书接口之前，前端会先发一个OPTIONS请求，用来检查这个接口是否存在，检查成功，会再次发一个正式的请求
                .maxAge(3600); // 1小时内不需要再预检（发OPTIONS请求）
    }

}
