package com.epam.esm.controller.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.epam.esm"})
public class MySpringBootApplication {
   public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);

    }

}
