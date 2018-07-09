package com.lh.manager;

import com.lh.swagger.EnableMySwagger;
import com.lh.swagger.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

/**
 * 管理端启动类
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.lh.entity"})
public class ManagerApp {

    public static void main(String[] args){
        SpringApplication.run(ManagerApp.class);
    }

}
