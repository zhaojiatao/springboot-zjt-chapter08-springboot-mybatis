/*
package com.zjt.web;

import com.github.pagehelper.PageInfo;
import com.zjt.entity.Student;
import com.zjt.model.QueryStudentList;
import com.zjt.service.StudentService;
import com.zjt.util.AjaxObject;
import com.zjt.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController extends AbstractController{

    @Autowired
    private StudentService studentService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    */
/**
     * 查询学生列表
     *//*

    @RequestMapping("/queryStudentList")
    public AjaxObject selectByPages(Page<QueryStudentList> page){
        List<Student> studentList=studentService.queryStudentList(page);
        PageInfo<Student> pageInfo =new PageInfo<Student>(studentList);
        return AjaxObject.ok().put("page", pageInfo);
    }





}
*/
