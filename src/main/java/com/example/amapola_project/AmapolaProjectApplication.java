package com.example.amapola_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class AmapolaProjectApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AmapolaProjectApplication.class, args);
    }

}