package com.zjt.service;

import com.zjt.entity.Student;
import com.zjt.model.QueryStudentList;
import com.zjt.util.Page;

import java.util.List;

public interface StudentService  extends IService<Student>{

    public List<Student> queryStudentList(Page<QueryStudentList> page);





}
