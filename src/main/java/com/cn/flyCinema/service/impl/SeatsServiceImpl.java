package com.cn.flyCinema.service.impl;

import com.cn.flyCinema.dao.SeatsDao;
import com.cn.flyCinema.dao.impl.SeatsDaoImpl;
import com.cn.flyCinema.entity.Seating;
import com.cn.flyCinema.service.SeatsService;

import java.util.List;

public class SeatsServiceImpl implements SeatsService {
    private SeatsDao seatsDao = new SeatsDaoImpl();
    @Override
    public List<Seating> getAllSeats(Integer sid) {
        List<Seating> list = seatsDao.getAllSeats(sid);
        return list;
    }
}
