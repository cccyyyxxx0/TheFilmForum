package com.filmForum.dao.Impl;

import com.filmForum.dao.BaseDao;
import com.filmForum.dao.CommentDao;
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
        String sql = "DELETE FROM `comment` WHERE `commentId` = ? ";
        return update(sql, id);
    }

    public int updateById(Comment comment) {
        String sql = "UPDATE `comment` SET `commentType`=?,`movieId` = ? ,`commentUserId` = ? ,`commentContent` = ? ,`commentTime` = ?  WHERE `commentId`= ?";
        return update(sql, comment.getCommentType(),comment.getMovieId(),comment.getCommentUserId(),comment.getCommentContent(),comment.getCommentTime(),comment.getCommentId());

    }

    public Comment queryCommentById(Integer id) {
        String sql = "SELECT * FROM `comment` where `commentId` = ?";
        return queryForOne(Comment.class, sql, id);
    }

    public List<Comment> queryAll() {
        String sql = "SELECT * FROM `comment`";
        return queryForList(Comment.class, sql);
    }

    public Integer queryTotalCount() {
        String sql = "SELECT COUNT(1) FROM `comment`";
        return (Integer) queryForSingleValue(sql);
    }

    public List<Comment> queryCommentByPage(Integer begin, Integer pageSize) {
        String sql = "SELECT * FROM `comment` LIMIT ?,?";
        return queryForList(Comment.class, sql, begin, pageSize);
    }
}
