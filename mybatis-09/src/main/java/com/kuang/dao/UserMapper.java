package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //查询用户
    User queryUsersById(@Param("tid") int id);

}
