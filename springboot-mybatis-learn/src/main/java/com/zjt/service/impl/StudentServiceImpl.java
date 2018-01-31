/*
package com.zjt.service.impl;

import com.github.pagehelper.PageHelper;
import com.zjt.entity.Student;
import com.zjt.mapper.StudentMapper;
import com.zjt.model.QueryStudentList;
import com.zjt.service.StudentService;
import com.zjt.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl extends BaseService<Student>  implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudentList(Page<QueryStudentList> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return studentMapper.queryStudentList(page.getCondition());
    }
}
*/
