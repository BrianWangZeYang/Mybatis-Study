package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/12 13:52
 */
public interface UserDao {
    //获取User的List集合
    List<User> getUserList();
}
