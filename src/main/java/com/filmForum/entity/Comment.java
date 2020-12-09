package com.filmForum.entity;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:05
 * 描述:
 */
public class Comment {
    private Integer commentId;
    private Integer commentType;
    private Integer movieId;
    private String commentUserId;
    private String commentContent;
    private String commentTime;

    public Comment() {
    }

    public Comment(Integer commentId, Integer commentType, Integer movieId, String commentUserId, String commentContent, String commentTime) {
        this.commentId = commentId;
        this.commentType = commentType;
        this.movieId = movieId;
        this.commentUserId = commentUserId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }
}
