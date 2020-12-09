package com.filmForum.service;

import com.filmForum.entity.Comment;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:37
 * 描述:
 */
public interface CommentService {
    int insert(Comment comment);

    int deleteById(Integer id);

    int updateById(Comment comment);

    Comment queryCommentById(Integer id);

    List<Comment> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<Comment> queryCommentByPage(Integer begin,Integer pageSize);
}
