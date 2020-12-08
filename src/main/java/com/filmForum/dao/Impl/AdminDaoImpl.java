package com.filmForum.dao.Impl;

import com.filmForum.dao.AdminDao;
import com.filmForum.dao.BaseDao;
import com.filmForum.entity.Admin;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:09
 * 描述:
 */
public class AdminDaoImpl extends BaseDao implements AdminDao {
    public int insert(Admin admin) {
        String sql = "INSERT INTO `admin`(`title`,`username`,`password`,`addTime`,`lastTime`,`logCount`,`image`) VALUES(?,?,?,?,?,?,?) ";
        return update(sql,admin.getTitle(), admin.getUsername(), admin.getPassword(), admin.getAddTime(),admin.getLastTime(),admin.getLogCount(),  admin.getImage());

    }

    public int deleteById(Integer id) {
        return 0;
    }

    public int updateById(Admin admin) {
        return 0;
    }

    public Admin queryAdminById(Integer id) {
        return null;
    }

    public List<Admin> queryAll() {
        return null;
    }

    public Integer queryTotalCount() {
        return null;
    }

    public List<Admin> queryAdminByPage(Integer begin, Integer pageSize) {
        return null;
    }

    public Admin queryAdminByUsernameAndPassword(Admin admin) {
        return null;
    }
}
