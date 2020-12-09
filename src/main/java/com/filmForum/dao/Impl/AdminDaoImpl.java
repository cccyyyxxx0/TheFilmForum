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
        String sql = "DELETE FROM `admin` WHERE `id` = ? ";
        return update(sql, id);
    }

    public int updateById(Admin admin) {
        String sql = "UPDATE `admin` SET `title` = ?, `username`=?,`password`=?,`addTime` = ? ,`lastTime` = ? ,`logCount` = ? ,`image` = ?  WHERE `id`= ?";
        return update(sql,admin.getTitle(), admin.getUsername(), admin.getPassword(), admin.getAddTime(),admin.getLastTime(),admin.getLogCount(), admin.getImage(), admin.getId());
    }

    public Admin queryAdminById(Integer id) {
        String sql = "SELECT * FROM `admin` where `id` = ?";
        return queryForOne(Admin.class, sql, id);
    }

    public List<Admin> queryAll() {
        String sql = "SELECT * FROM `admin`";
        return queryForList(Admin.class, sql);
    }

    public Integer queryTotalCount() {
        String sql = "SELECT COUNT(1) FROM `admin`";
        return (Integer) queryForSingleValue(sql);
    }

    public List<Admin> queryAdminByPage(Integer begin, Integer pageSize) {
        String sql = "SELECT * FROM `admin` LIMIT ?,?";
        return queryForList(Admin.class, sql, begin, pageSize);
    }

    public Admin queryAdminByUsernameAndPassword(Admin admin) {
        String sql = "SELECT * FROM `admin` WHERE `username` = ? AND `password` = ?";
        return queryForOne(Admin.class, sql, admin.getUsername(), admin.getPassword());
    }
}
