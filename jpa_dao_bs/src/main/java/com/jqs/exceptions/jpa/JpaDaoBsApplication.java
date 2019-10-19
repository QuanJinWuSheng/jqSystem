package com.jqs.exceptions.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.jqs.*"})
public class JpaDaoBsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDaoBsApplication.class, args);
    }

}
