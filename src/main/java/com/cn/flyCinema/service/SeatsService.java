package com.cn.flyCinema.service;

import com.cn.flyCinema.entity.Seating;

import java.util.List;

public interface SeatsService {
    List<Seating> getAllSeats(Integer sid);
}
