package com.filmForum.dao;

import com.filmForum.entity.Movie;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:07
 * 描述:
 */
public interface MovieDao {
    int insert(Movie movie);

    int deleteById(Integer id);

    int updateById(Movie movie);

    Movie queryMovieById(Integer id);

    List<Movie> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<Movie> queryMovieByPage(Integer begin,Integer pageSize);
}
