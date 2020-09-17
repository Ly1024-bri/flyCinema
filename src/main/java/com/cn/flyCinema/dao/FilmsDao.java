package com.cn.flyCinema.dao;

import com.cn.flyCinema.entity.Movie;

import java.util.List;

public interface FilmsDao {

    List<Movie> findWillShowFilms();

    List<Movie> findFilmsByScore();

    List<Movie> findNewestFilmsByDate();
    List<Movie> findHottestFilms();
    Movie findFilmsByMid(int mid);

    int Count();

    List<Movie> findByCP(int currentPage, int pageSize);

    List<Movie> findHotByCP(int currentPage, int pageSize);

    int HotCount();

    int NextCount();

    List<Movie> findNextByCP(int currentPage, int pageSize);
}
