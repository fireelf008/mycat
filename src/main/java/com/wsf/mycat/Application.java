package com.wsf.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring boot 启动类
 * @author wsf
 * @since 2017/10/16
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.wsf.mycat.mapper")
public class Application extends SpringBootServletInitializer {

    /**
     * tomcat启动
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    /**
     * jar启动
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}