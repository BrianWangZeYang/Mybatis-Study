package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/18 22:35
 */
public interface StudentMapper {
    //查询所有的学生信息以及对应老师的信息。
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
