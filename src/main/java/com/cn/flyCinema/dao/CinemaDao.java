package com.cn.flyCinema.dao;

import com.cn.flyCinema.entity.Cinema;

import java.util.List;

public interface CinemaDao {
    List<Cinema> findCinema(int aid);
}
