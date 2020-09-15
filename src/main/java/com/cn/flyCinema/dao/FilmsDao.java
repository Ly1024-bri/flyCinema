package com.cn.flyCinema.dao;

import com.cn.flyCinema.entity.Movie;

import java.util.List;

public interface FilmsDao {
    List<Movie> findHottestFilms();

    List<Movie> findWillShowFilms();
}
