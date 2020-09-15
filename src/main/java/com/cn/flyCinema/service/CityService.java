package com.cn.flyCinema.service;

import com.cn.flyCinema.entity.Area;
import com.cn.flyCinema.entity.Cinema;
import com.cn.flyCinema.entity.City;

import java.util.List;

public interface CityService {
    List<City> findAllCity();

    List<Area> findArea(int cid);

    List<Cinema> findCinema(int aid);
}
