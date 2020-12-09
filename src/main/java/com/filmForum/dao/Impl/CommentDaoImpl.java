package com.filmForum.dao.Impl;

import com.filmForum.dao.BaseDao;
import com.filmForum.dao.CommentDao;
import com.filmForum.entity.Admin;
import com.filmForum.entity.Comment;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:36
 * 描述:
 */
public class CommentDaoImpl extends BaseDao implements CommentDao {
    public int insert(Comment comment) {
        String sql = "INSERT INTO `comment`(`commentType`,`movieId`,`commentUserId`,`commentContent`,`commentTime`) VALUES(?,?,?,?,?) ";
        return update(sql,comment.getCommentType(),comment.getMovieId(),comment.getCommentUserId(),comment.getCommentContent(),comment.getCommentTime());
    }

    public int deleteById(Integer id) {
        return 0;
    }

    public int updateById(Comment comment) {
        return 0;
    }

    public Admin queryCommentById(Integer id) {
        return null;
    }

    public List<Admin> queryAll() {
        return null;
    }

    public Integer queryTotalCount() {
        return null;
    }

    public List<Admin> queryCommentByPage(Integer begin, Integer pageSize) {
        return null;
    }
}
