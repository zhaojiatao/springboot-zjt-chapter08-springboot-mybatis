package com.zjt.entity;

import javax.persistence.*;

@Table(name = "t_student")
public class Student {
    /**
     * 学生表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生所在的班级id
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 班主任id
     */
    @Column(name = "teacher_id")
    private String teacherId;

    /**
     * 获取学生表主键
     *
     * @return id - 学生表主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置学生表主键
     *
     * @param id 学生表主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取学生姓名
     *
     * @return name - 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     *
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取学生所在的班级id
     *
     * @return class_id - 学生所在的班级id
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 设置学生所在的班级id
     *
     * @param classId 学生所在的班级id
     */
    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    /**
     * 获取班主任id
     *
     * @return teacher_id - 班主任id
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * 设置班主任id
     *
     * @param teacherId 班主任id
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }
}