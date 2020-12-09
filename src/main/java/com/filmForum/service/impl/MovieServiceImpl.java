package com.filmForum.service.impl;

import com.filmForum.dao.Impl.MovieDaoImpl;
import com.filmForum.dao.MovieDao;
import com.filmForum.entity.Movie;
import com.filmForum.service.MovieService;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 10:03
 * 描述:
 */
public class MovieServiceImpl implements MovieService {
    MovieDao movieDao=new MovieDaoImpl();
    @Override
    public int insert(Movie movie) {
        return movieDao.insert(movie);
    }

    @Override
    public int deleteById(Integer id) {
        return movieDao.deleteById(id);
    }

    @Override
    public int updateById(Movie movie) {
        return movieDao.updateById(movie);
    }

    @Override
    public Movie queryMovieById(Integer id) {
        return movieDao.queryMovieById(id);
    }

    @Override
    public List<Movie> queryAll() {
        return movieDao.queryAll();
    }

    @Override
    public Integer queryTotalCount() {
        return movieDao.queryTotalCount();
    }

    @Override
    public List<Movie> queryMovieByPage(Integer begin, Integer pageSize) {
        return movieDao.queryMovieByPage(begin, pageSize);
    }
}
