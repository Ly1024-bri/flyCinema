package com.cn.flyCinema.entity;

import java.util.Date;

public class Movie {

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Movie() {
    }

    private int mid;
    private String classify;
    private String name;
    private String director;
    private String protagonist;
    private String type;
    private String region;
    private String showtime;
    private String introduction;
    private int score;
    private String img;
    private Date date;

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", classify='" + classify + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", protagonist='" + protagonist + '\'' +
                ", type='" + type + '\'' +
                ", region='" + region + '\'' +
                ", showtime='" + showtime + '\'' +
                ", introduction='" + introduction + '\'' +
                ", score=" + score +
                ", img='" + img + '\'' +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
