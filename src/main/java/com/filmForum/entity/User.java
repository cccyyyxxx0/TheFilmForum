package com.filmForum.entity;

/**
 * 作者：cyx
 * 日期: 2020/12/8 16:50
 * 描述:
 */
public class User {
    private Integer id;//会员编号
    private String username;//登录帐号
    private String password;//登录密码
    private String phone;//固定电话或手机号码
    private String QQ;//QQ
    private String email;//电子邮箱
    private String sex;//性别
    private String regTime;//注册时间
    private Integer loginCount;//  登录次数
    private String image;//头像

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", QQ='" + QQ + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", regTime='" + regTime + '\'' +
                ", loginCount='" + loginCount + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public User(String username, String password, String phone, String email) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
