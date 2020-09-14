package com.cn.flyCinema.entity;

public class Area {
    private int aid;
    private String name;
    private int cid;

    @Override
    public String toString() {
        return "Area{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", cid=" + cid +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Area() {
    }
}
