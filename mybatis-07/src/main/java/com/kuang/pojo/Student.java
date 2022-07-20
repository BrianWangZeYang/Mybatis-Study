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

    private int tid;
}
