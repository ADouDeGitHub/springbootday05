package com.example.demo.config;

import com.example.demo.pojo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//当前类成为配置类，直接当值spring的配置文件使用
public class StuConfig {
    //配置bean
    @Bean
    public Students students() {
        Students s = new Students();
        s.setId(10);

        return s;
    }

}
