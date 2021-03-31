package com.guigui.boot;

import com.guigui.boot.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(User.class)
@MapperScan("com.guigui.boot.dao")
public class BootWeb01Application {

    public static void main(String[] args) {
        SpringApplication.run(BootWeb01Application.class, args);
    }

}
