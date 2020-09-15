package com.cn.flyCinema.service;

import com.cn.flyCinema.entity.Movie;

import java.util.List;

public interface FilmsService {
    List<Movie> findHottestFilms();

    List<Movie> findWillShowFilms();

    List<Movie> findFilmsByScore();
}
