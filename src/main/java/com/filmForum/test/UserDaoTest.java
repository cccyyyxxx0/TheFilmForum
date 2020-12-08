package com.filmForum.test;

import com.filmForum.dao.Impl.UserDaoImpl;
import com.filmForum.dao.UserDao;
import org.junit.Test;

/**
 * 作者：cyx
 * 日期: 2020/12/8 18:30
 * 描述:
 */
public class UserDaoTest {
    UserDao userDao=new UserDaoImpl();
    @Test
    public void queryUserByIdTest(){
        System.out.println(userDao.queryUserById(1));
    }
}
