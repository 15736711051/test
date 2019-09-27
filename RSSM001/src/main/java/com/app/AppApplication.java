package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@MapperScan("com.app.mapper")//将项目中对应的mapper类的路径加进来就可以了
//@ComponentScan(basePackages={"com.app.mapper","com.app.controller","com.app.model","com.app.service"})
//@ComponentScan(basePackages={"com.app"})
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
