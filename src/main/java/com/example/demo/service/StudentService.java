package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Students> queryAll(){
        return studentDao.queryAll();
    }



}
