package com.example.demo.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MybatisConf {

//    //创建MapperAcannerConfig
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        //根据datasoureUtil中的方法产生一个没有batis核心对象
//        msc.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
//        //获取
//        msc.setBasePackage("com.example.demo.dao");
//        return msc;
//
//    }
}
