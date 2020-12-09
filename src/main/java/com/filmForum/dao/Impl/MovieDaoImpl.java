package com.filmForum.dao.Impl;

import com.filmForum.dao.BaseDao;
import com.filmForum.dao.MovieDao;
import com.filmForum.entity.Movie;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:48
 * 描述:
 */
public class MovieDaoImpl extends BaseDao implements MovieDao {

    @Override
    public int insert(Movie movie) {
        String sql = "INSERT INTO `movie`(`name`,`typeId`,`director`,`toStar`,`showTime`,`picAddress`,`content`,`addTime`,`hits`) VALUES(?,?,?,?,?,?,?,?,?) ";
        return update(sql,movie.getName(),movie.getTypeId(),movie.getDirector(),movie.getToStar(),movie.getShowTime(),movie.getPicAddress(),movie.getContent(),movie.getAddTime(),movie.getHits());
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "DELETE FROM `movie` WHERE `id` = ? ";
        return update(sql, id);
    }

    @Override
    public int updateById(Movie movie) {
        String sql = "UPDATE `movie` SET `name` = ?, `typeId`=?,`director`=?,`toStar` = ? ,`showTime` = ? ,`picAddress` = ? ,`content` = ? ,`addTime` = ? ,`hits` = ? WHERE `id`= ?";
        return update(sql,movie.getName(),movie.getTypeId(),movie.getDirector(),movie.getToStar(),movie.getShowTime(),movie.getPicAddress(),movie.getContent(),movie.getAddTime(),movie.getHits(),movie.getId());
    }

    @Override
    public Movie queryMovieById(Integer id) {
        String sql = "SELECT * FROM `movie` where `id` = ?";
        return queryForOne(Movie.class, sql, id);
    }

    @Override
    public List<Movie> queryAll() {
        String sql = "SELECT * FROM `movie`";
        return queryForList(Movie.class, sql);
    }

    @Override
    public Integer queryTotalCount() {
        String sql = "SELECT COUNT(1) FROM `movie`";
        return (Integer) queryForSingleValue(sql);
    }

    @Override
    public List<Movie> queryMovieByPage(Integer begin, Integer pageSize) {
        String sql = "SELECT * FROM `movie` LIMIT ?,?";
        return queryForList(Movie.class, sql, begin, pageSize);
    }
}
