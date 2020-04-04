package com.hebut.lianchuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hebut.lianchuang.mapper")
public class LianchuangApplication {

    public static void main(String[] args) {
        SpringApplication.run(LianchuangApplication.class, args);
    }

}
