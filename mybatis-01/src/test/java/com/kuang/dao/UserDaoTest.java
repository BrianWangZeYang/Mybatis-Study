package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserLike(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            List<User> users = mapper.getUserLike("%召%");
            for (User user:users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void test(){
        SqlSession sqlSession = null;
        try {
            //第一步：获得SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();


            //方式一：getMapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            //方式二：
            //List<pojo.User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void getUserById2Test(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("userid",6);
            User user = userMapper.getUserById2(map);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }


    @Test
    public void insertUser(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int res = userMapper.insertUser(new User(7,"李召扬","888"));
            if (res > 0){
                System.out.println("插入成功!"+res);
            }
            //插入语句需要手动提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void insertUser2(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("userid",6);
            map.put("userName","王召阳");
            map.put("userPwd","123456");
            int res = userMapper.insertUser2(map);
            if (res > 0){
                System.out.println("插入成功!"+res);
            }
            //插入语句需要手动提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //第一步：获取接口
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            int ref = mapper.updateUser(new User(4, "王泽阳", "123456"));
            if (ref > 0){
                System.out.println("修改成功");
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            int res = mapper.deleteUser(4);
            if (res>0){
                System.out.println("删除成功！");
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
