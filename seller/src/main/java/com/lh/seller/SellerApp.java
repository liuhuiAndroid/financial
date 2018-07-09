package com.lh.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 销售端启动类
 */
@SpringBootApplication
public class SellerApp {

    public static void main(String[] args){
        SpringApplication.run(SellerApp.class);
    }

}
