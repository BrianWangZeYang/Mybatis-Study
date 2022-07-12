package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/12 14:01
 */
public class UserDaoTest {
    @Test
    public void  test(){
        SqlSession session = null;
        try {
            session = MybatisUtils.getSqlSession();
            UserDao userDao = session.getMapper(UserDao.class);
            List<User> userList = userDao.getUserList();

            for (User user:userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
