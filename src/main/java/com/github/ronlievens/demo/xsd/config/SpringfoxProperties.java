package com.github.ronlievens.demo.xsd.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties("springfox")
public class SpringfoxProperties {
    private String basePackage;
    private List<String> paths;
    private String title;
    private String description;
    private String version;
}
