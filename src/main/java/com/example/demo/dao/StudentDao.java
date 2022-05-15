package com.example.demo.dao;

import com.example.demo.pojo.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    public List<Students> queryAll();

}
