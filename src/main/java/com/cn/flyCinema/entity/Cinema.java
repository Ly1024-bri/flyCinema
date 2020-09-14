package com.cn.flyCinema.entity;

public class Cinema {
    private int cid;
    private String name;
    private int aid;
    public Cinema() {
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", aid=" + aid +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
}
