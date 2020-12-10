package com.filmForum.dao;

import com.filmForum.entity.User;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 18:31
 * 描述:
 */
public interface UserDao {

    int insert(User user);

    int deleteById(Integer id);

    int updateById(User user);

    int updateLoginCount(User user);

    User queryUserById(Integer id);

    List<User> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<User> queryUserByPage(Integer begin,Integer pageSize);

    User queryUserByUsernameAndPassword(User user);
}
