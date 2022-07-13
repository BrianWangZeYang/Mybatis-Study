package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/11 23:33
 */
public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //查询用户通过以map作为参数的形式
    User getUserById2(Map<String,Object> map);
    //insert一个用户
    int insertUser(User user);
    //万能的Map
    int insertUser2(Map<String,Object> map);
    //修改一个用户
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);
}
