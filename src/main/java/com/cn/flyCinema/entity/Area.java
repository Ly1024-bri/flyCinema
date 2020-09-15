package com.cn.flyCinema.entity;

public class Area {
    private Integer aid;
    private String name;
    private Integer cid;

    public Area() {

    }

    public Area(Integer aid, String name, Integer cid) {
        this.aid = aid;
        this.name = name;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", cid=" + cid +
                '}';
    }
}
