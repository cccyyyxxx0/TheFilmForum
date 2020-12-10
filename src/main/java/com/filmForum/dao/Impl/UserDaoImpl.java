package com.filmForum.dao.Impl;

import com.filmForum.dao.BaseDao;
import com.filmForum.dao.UserDao;
import com.filmForum.entity.User;

import java.util.List;

/**
 * 作者：cyx
 * 日期: 2020/12/8 18:33
 * 描述:
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    public int insert(User user) {
        String sql = "INSERT INTO `user`(`username`,`password`,`phone`,`QQ`,`email`,`sex`,`regTime`,`loginCount`,`image`) VALUES(?,?,?,?,?,?,?,?,?) ";
        return update(sql, user.getUsername(), user.getPassword(), user.getPhone(), user.getQQ(), user.getEmail(), user.getSex(), user.getRegTime(), user.getLoginCount(), user.getImage());
    }

    public int deleteById(Integer id) {
        String sql = "DELETE FROM `user` WHERE `id` = ? ";
        return update(sql, id);
    }

    public int updateById(User user) {
        String sql = "UPDATE `user` SET `username`=?,`password`=?,`phone` = ? ,`QQ` = ? ,`email` = ? ,`sex` = ? ,`regTime` = ? ,`image` = ?  WHERE `id`= ?";
        return update(sql, user.getUsername(), user.getPassword(), user.getPhone(), user.getQQ(), user.getEmail(), user.getSex(), user.getRegTime(), user.getImage(), user.getId());

    }

    @Override
    public int updateLoginCount(User user) {
        String sql="UPDATE `user` SET `loginCount` = ? WHERE `id`= ? ";
        return update(sql,user.getLoginCount(),user.getId());
    }

    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM `user` where `id` = ?";
        return queryForOne(User.class, sql, id);
    }

    public List<User> queryAll() {
        String sql = "SELECT * FROM `user`";
        return queryForList(User.class, sql);
    }

    public Integer queryTotalCount() {
        String sql = "SELECT COUNT(1) FROM `user`";
        return (Integer) queryForSingleValue(sql);
    }

    public List<User> queryUserByPage(Integer begin, Integer pageSize) {
        String sql = "SELECT * FROM `user` LIMIT ?,?";
        return queryForList(User.class, sql, begin, pageSize);
    }

    public User queryUserByUsernameAndPassword(User user) {
        String sql = "SELECT * FROM `user` WHERE `username` = ? AND `password` = ?";
        return queryForOne(User.class, sql, user.getUsername(), user.getPassword());
    }
}
