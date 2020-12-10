package com.filmForum.entity;

/**
 * 作者：cyx
 * 日期: 2020/12/8 19:03
 * 描述:
 */
public class Admin {
    private Integer id;
    private String title;
    private String username;
    private String password;
    private String addTime;
    private String lastTime;
    private Integer logCount;
    private String image;

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", addTime='" + addTime + '\'' +
                ", lastTime='" + lastTime + '\'' +
                ", logCount=" + logCount +
                ", image='" + image + '\'' +
                '}';
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public Admin(Integer id, String title, String username, String password, String addTime, String lastTime, Integer logCount, String image) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.password = password;
        this.addTime = addTime;
        this.lastTime = lastTime;
        this.logCount = logCount;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getLogCount() {
        return logCount;
    }

    public void setLogCount(Integer logCount) {
        this.logCount = logCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
