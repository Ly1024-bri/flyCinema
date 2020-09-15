package com.cn.flyCinema.entity;

public class Cinema {
    private int cid;
    private String name;
    private int aid;
    private String img;
    private String address;
    private String phone;
    private Double score;

    @Override
    public String toString() {
        return "Cinema{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", aid=" + aid +
                ", img='" + img + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", score=" + score +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Cinema() {
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
