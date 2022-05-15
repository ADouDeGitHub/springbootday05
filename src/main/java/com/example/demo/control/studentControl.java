package com.example.demo.control;


import com.example.demo.pojo.Students;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class studentControl {
//    private static final Logger l = LoggerFactory.getLogger(studentControl.class);
    @Autowired
    StudentService studentService;

//    @ResponseBody
    @RequestMapping("/all")
    public String qa(Model model) {
        List<Students> ls=studentService.queryAll();
        model.addAttribute("student",ls);
//        l.info("访问的查询请求");
//        return studentService.queryAll().toString();
        return "query";
    }

}
