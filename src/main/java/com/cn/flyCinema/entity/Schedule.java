package com.cn.flyCinema.entity;

import java.util.Date;

public class Schedule {
    private Integer sid;
    private Integer cid;
    private Integer mid;
    private Date date;
    private String time;
    private String name;
    private Double price;
    private String language;

    public Schedule() {

    }

    public Schedule(Integer sid, Integer cid, Integer mid, Date date, String time, String name, Double price, String language) {
        this.sid = sid;
        this.cid = cid;
        this.mid = mid;
        this.date = date;
        this.time = time;
        this.name = name;
        this.price = price;
        this.language = language;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", mid=" + mid +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", language='" + language + '\'' +
                '}';
    }
}
