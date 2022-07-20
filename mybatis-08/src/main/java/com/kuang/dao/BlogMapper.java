package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/20 16:17
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);
    //查询博客
    List<Blog> queryBlogIF(Map map);
    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询第1、2、3号记录的博客(此处为了演示方便，将blog表中的值修改为1，2，3，4)
    List<Blog> queryBlogForeach(Map map);

}
