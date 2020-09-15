package com.cn.flyCinema.service.impl;

import com.cn.flyCinema.dao.AreaDao;
import com.cn.flyCinema.dao.CinemaDao;
import com.cn.flyCinema.dao.CityDao;
import com.cn.flyCinema.dao.impl.AreaDaoImpl;
import com.cn.flyCinema.dao.impl.CinemaDaoImpl;
import com.cn.flyCinema.dao.impl.CityDaoImpl;
import com.cn.flyCinema.entity.Area;
import com.cn.flyCinema.entity.Cinema;
import com.cn.flyCinema.entity.City;
import com.cn.flyCinema.service.CityService;

import java.util.List;

public class CityServiceImpl implements CityService {
    private CityDao cityDao = new CityDaoImpl();
    private AreaDao areaDao = new AreaDaoImpl();
    private CinemaDao cinemaDao = new CinemaDaoImpl();

    @Override
    public List<City> findAllCity() {



        return  cityDao.findAllCity();
    }

    @Override
    public List<Area> findArea(int cid) {


        return  areaDao.findArea(cid);

    }

    @Override
    public List<Cinema> findCinema(int aid) {



        return cinemaDao.findCinema(aid);
    }
}
