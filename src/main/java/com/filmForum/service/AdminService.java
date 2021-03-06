package com.filmForum.service;

import com.filmForum.entity.Admin;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/12/9 9:36
 * 描述:
 */
public interface AdminService {
    int insert(Admin admin);

    int deleteById(Integer id);

    int updateById(Admin admin);

    int updateLoginCountAndLastTime(Admin admin);

    Admin queryAdminById(Integer id);

    List<Admin> queryAll();

    //查询总条数
    Integer queryTotalCount();

    //分页查询
    List<Admin> queryAdminByPage(Integer begin,Integer pageSize);

    Admin queryAdminByUsernameAndPassword(Admin admin);
}
