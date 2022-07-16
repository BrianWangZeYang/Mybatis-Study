package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory -->sqlSession
public class MybatisUtils {
    //提升SqlSessionFactory 作用域
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //使用Mybatis第一步：获取sqlSessionFactory
            String resourse = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resourse);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //既然有了SqlSessionFactory，顾名思义，我们就可以从中获取到SqlSession的实例了。
    //SqlSession 完全包含了面向数据库执行Sql命令所需的方法。

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
