package com.kuang.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/18 22:34
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
