package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wzy
 * @version 1.0
 * @Description
 * @date 2022/7/18 22:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String name;

    //学生需要关联一个老师！
    private Teacher teacher;
}
