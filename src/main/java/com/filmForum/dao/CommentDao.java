package com.filmForum.dao;

import com.filmForum.entity.Admin;
import com.filmForum.entity.Comment;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:07
 * 描述:
 */
public interface CommentDao {

    int insert(Comment comment);

    int deleteById(Integer id);

    int updateById(Comment comment);

    Admin queryCommentById(Integer id);

    List<Admin> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<Admin> queryCommentByPage(Integer begin,Integer pageSize);
}
