package com.filmForum.entity;

/**
 * 作者：cyx
 * 日期: 2020/12/8 18:29
 * 描述:
 */
public class Movie {
    private Integer id;
    private String name;
    private Integer typeId;
    private String director;
    private String toStar;
    private String showTime;
    private String picAddress;
    private String content;
    private String addTime;
    private Integer hits;

    public Movie() {
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                ", director='" + director + '\'' +
                ", toStar='" + toStar + '\'' +
                ", showTime='" + showTime + '\'' +
                ", picAddress='" + picAddress + '\'' +
                ", content='" + content + '\'' +
                ", addTime='" + addTime + '\'' +
                ", hits=" + hits +
                '}';
    }

    public Movie(Integer id, String name, Integer typeId, String director, String toStar, String showTime, String picAddress, String content, String addTime, Integer hits) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.director = director;
        this.toStar = toStar;
        this.showTime = showTime;
        this.picAddress = picAddress;
        this.content = content;
        this.addTime = addTime;
        this.hits = hits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getToStar() {
        return toStar;
    }

    public void setToStar(String toStar) {
        this.toStar = toStar;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }
}
