package com.filmForum.service;

import com.filmForum.entity.User;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:37
 * 描述:
 */
public interface UserService {
    int insert(User user);

    int deleteById(Integer id);

    int updateById(User user);

    User queryUserById(Integer id);

    List<User> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<User> queryUserByPage(Integer begin,Integer pageSize);

    User queryUserByUsernameAndPassword(User user);
}
