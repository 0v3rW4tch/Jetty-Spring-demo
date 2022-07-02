package com.example.jettytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ServletComponentScan
//添加继承了SpringBootServletInitializer extends SpringBootServletInitializer
//extends SpringBootServletInitializer
public class JettyTestApplication  {


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
////        return super.configure(builder);
//        return builder.sources(JettyTestApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(JettyTestApplication.class, args);
    }

}
