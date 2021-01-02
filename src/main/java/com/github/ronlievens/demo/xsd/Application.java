package com.github.ronlievens.demo.xsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.TimeZone;

import static java.util.Locale.ENGLISH;

@SpringBootApplication
public class Application {
    private static final String ZONE = "Europe/Amsterdam";

    public static void main(String[] args) {
        // Always set default timezone
        TimeZone.setDefault(TimeZone.getTimeZone(ZONE));

        // Always set English as default
        Locale.setDefault(ENGLISH);

        // Start spring boot application
        SpringApplication.run(Application.class, args);
    }
}
