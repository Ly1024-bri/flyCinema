package com.cn.flyCinema.entity;

public class Seating {
    private int id;
    private int sid;
    private int coord;
    private String selected;

    @Override
    public String toString() {
        return "Seating{" +
                "id=" + id +
                ", sid=" + sid +
                ", coord=" + coord +
                ", selected='" + selected + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public Seating() {
    }
}
