package com.filmForum.service.impl;

import com.filmForum.dao.CommentDao;
import com.filmForum.dao.Impl.CommentDaoImpl;
import com.filmForum.entity.Comment;
import com.filmForum.service.CommentService;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:38
 * 描述:
 */
public class CommentServiceImpl implements CommentService {
    CommentDao commentDao=new CommentDaoImpl();
    @Override
    public int insert(Comment comment) {
        return commentDao.insert(comment);
    }

    @Override
    public int deleteById(Integer id) {
        return commentDao.deleteById(id);
    }

    @Override
    public int updateById(Comment comment) {
        return commentDao.updateById(comment);
    }

    @Override
    public Comment queryCommentById(Integer id) {
        return commentDao.queryCommentById(id);
    }

    @Override
    public List<Comment> queryAll() {
        return commentDao.queryAll();
    }

    @Override
    public Integer queryTotalCount() {
        return commentDao.queryTotalCount();
    }

    @Override
    public List<Comment> queryCommentByPage(Integer begin, Integer pageSize) {
        return commentDao.queryCommentByPage(begin,pageSize);
    }
}
