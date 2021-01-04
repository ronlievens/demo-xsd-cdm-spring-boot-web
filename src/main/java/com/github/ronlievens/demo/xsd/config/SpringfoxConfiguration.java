package com.github.ronlievens.demo.xsd.config;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@RequiredArgsConstructor
@Configuration
public class SpringfoxConfiguration {

    private final SpringfoxProperties properties;

    @Bean
    public Docket productApi() {
        val docket = new Docket(DocumentationType.OAS_30)
            .select()
            .apis(RequestHandlerSelectors.basePackage(properties.getBasePackage()))
            .build()
            .apiInfo(metaData());
        for (val path : properties.getPaths()) {
            docket.select().paths(regex(path));

        }
        return docket;
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
            .title(properties.getTitle())
            .description(properties.getDescription())
            .version(properties.getVersion())
            .build();
    }
}
