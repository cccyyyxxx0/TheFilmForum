package com.filmForum.service.impl;

import com.filmForum.dao.Impl.UserDaoImpl;
import com.filmForum.dao.UserDao;
import com.filmForum.entity.User;
import com.filmForum.service.UserService;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:39
 * 描述:
 */
public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public int updateById(User user) {
        return userDao.updateById(user);
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public Integer queryTotalCount() {
        return userDao.queryTotalCount();
    }

    @Override
    public List<User> queryUserByPage(Integer begin, Integer pageSize) {
        return userDao.queryUserByPage(begin, pageSize);
    }

    @Override
    public User queryUserByUsernameAndPassword(User user) {
        return userDao.queryUserByUsernameAndPassword(user);
    }
}
