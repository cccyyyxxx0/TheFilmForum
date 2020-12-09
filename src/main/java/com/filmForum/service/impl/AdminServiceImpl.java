package com.filmForum.service.impl;

import com.filmForum.dao.AdminDao;
import com.filmForum.dao.Impl.AdminDaoImpl;
import com.filmForum.entity.Admin;
import com.filmForum.service.AdminService;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:38
 * 描述:
 */
public class AdminServiceImpl implements AdminService {
    AdminDao adminDao=new AdminDaoImpl();
    @Override
    public int insert(Admin admin) {
        return adminDao.insert(admin);
    }

    @Override
    public int deleteById(Integer id) {
        return adminDao.deleteById(id);
    }

    @Override
    public int updateById(Admin admin) {
        return adminDao.updateById(admin);
    }

    @Override
    public Admin queryAdminById(Integer id) {
        return adminDao.queryAdminById(id);
    }

    @Override
    public List<Admin> queryAll() {
        return adminDao.queryAll();
    }

    @Override
    public Integer queryTotalCount() {
        return adminDao.queryTotalCount();
    }

    @Override
    public List<Admin> queryAdminByPage(Integer begin, Integer pageSize) {
        return adminDao.queryAdminByPage(begin,pageSize);
    }

    @Override
    public Admin queryAdminByUsernameAndPassword(Admin admin) {
        return adminDao.queryAdminByUsernameAndPassword(admin);
    }
}
