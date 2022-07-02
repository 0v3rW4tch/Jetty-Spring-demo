package com.example.jettytest.Config;

import com.example.jettytest.Filter.TestFilter;
import org.springframework.boot.web.servlet.DelegatingFilterProxyRegistrationBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {

    @Bean
    public TestFilter testFilter(){
        return new TestFilter();
    }

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(testFilter());
        bean.addUrlPatterns("/portals/resume/*");
        bean.setName("testjetty");
        bean.setOrder(1);
        return bean;
    }

}
