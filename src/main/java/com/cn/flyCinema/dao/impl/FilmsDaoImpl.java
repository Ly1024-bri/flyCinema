package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.FilmsDao;
import com.cn.flyCinema.entity.Movie;

import java.util.List;

public class FilmsDaoImpl implements FilmsDao {
    @Override
    public List<Movie> findHottestFilms() {
        String sql = "select * from table_movie ";
        return null;
    }

    @Override
    public List<Movie> findFilmsByScore() {
        String sql = "select * from table_movie order by score desc";
        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class));
        return list;
    }
}
