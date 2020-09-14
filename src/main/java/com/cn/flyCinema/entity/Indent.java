package com.cn.flyCinema.entity;

public class Indent {
    private int id;
    private int uid;
    private int sid;
    private int coord;

    @Override
    public String toString() {
        return "Indent{" +
                "id=" + id +
                ", uid=" + uid +
                ", sid=" + sid +
                ", coord=" + coord +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCoord() {
        return coord;
    }

    public void setCoord(int coord) {
        this.coord = coord;
    }

    public Indent() {
    }
}
