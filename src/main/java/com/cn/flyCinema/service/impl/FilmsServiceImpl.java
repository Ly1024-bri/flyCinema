package com.cn.flyCinema.service.impl;

import com.cn.flyCinema.dao.FilmsDao;
import com.cn.flyCinema.dao.impl.FilmsDaoImpl;
import com.cn.flyCinema.entity.Movie;
import com.cn.flyCinema.service.FilmsService;

import java.util.List;

public class  FilmsServiceImpl implements FilmsService {
    FilmsDao filmsDao = new FilmsDaoImpl();

    @Override
    public List<Movie> findHottestFilms() {
        List<Movie> list = filmsDao.findHottestFilms();
        return list;
    }

    @Override
    public List<Movie> findWillShowFilms() {
        List<Movie> list = filmsDao.findWillShowFilms();
        return list;
    }

    @Override
    public List<Movie> findFilmsByScore() {
        List<Movie> list = filmsDao.findFilmsByScore();
        return list;
    }
}
