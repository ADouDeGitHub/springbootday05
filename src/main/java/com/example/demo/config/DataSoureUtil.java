package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class DataSoureUtil {
//    @Autowired
//    private DataSource dataSoure;
//
//
//    //创建mybatis核心对象sqlsessionFatoryBean
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
//        //注入数据源
//        sfb.setDataSource(dataSoure);
//        //设置表名
//        sfb.setTypeAliasesPackage("com.example.demo.pojo");
//        //获取核心对象
//        try {
//            return sfb.getObject();
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//    }
}
