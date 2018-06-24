package com.example.lydatashow;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lydatashow.mapper")
public class LydatashowApplication {

    public static void main(String[] args) {
        SpringApplication.run(LydatashowApplication.class, args);
    }
}
