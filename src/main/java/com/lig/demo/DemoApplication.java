package com.lig.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication   {

    public static void main(String[] args) {
            SpringApplication app=new SpringApplication(DemoApplication.class);
            app.run(args);
    }



}
