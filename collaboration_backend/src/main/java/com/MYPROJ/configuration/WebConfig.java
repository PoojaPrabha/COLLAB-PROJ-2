package com.MYPROJ.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//dispatcher-servlet.xml in project 1
@Configuration
@EnableWebMvc   //<mvc:annotation-driven>
@ComponentScan(basePackages="com.MYPROJ")
public class WebConfig extends WebMvcConfigurerAdapter{
public WebConfig(){
	System.out.println("WEBCONFIG class is instantiated");
}
}