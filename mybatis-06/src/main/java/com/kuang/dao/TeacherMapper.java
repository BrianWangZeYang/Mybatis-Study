package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/18 22:36
 */
public interface TeacherMapper {
        @Select("select * from mybatis.teacher where id =#{tid}")
        Teacher getTeacher(@Param("tid") int id);
}
