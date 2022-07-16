package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserMapper.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Integer> map = new HashMap<>();
            map.put("startIndex",0);
            map.put("pageSize",2);
            List<User> userByLimit = mapper.getUserByLimit(map);
            for (User user : userByLimit) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        logger.info("测试:进入getUserById成功！");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }
    @Test
    public void tsetLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("errot:进入了testLog4j");

    }
}
