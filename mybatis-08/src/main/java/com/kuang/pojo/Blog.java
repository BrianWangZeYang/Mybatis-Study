package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/20 16:15
 */
@Data
@SuppressWarnings("all")//抑制警告
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致。
    private int views;
}
