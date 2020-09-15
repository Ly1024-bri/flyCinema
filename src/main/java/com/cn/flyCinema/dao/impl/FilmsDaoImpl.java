package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.FilmsDao;
import com.cn.flyCinema.entity.Movie;
import com.cn.flyCinema.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FilmsDaoImpl implements FilmsDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Movie> findHottestFilms() {
        String sql = "select * from table_movie where date < ? order by mid";

        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class), "2020-9-15");
        return list;
    }

    @Override
    public List<Movie> findWillShowFilms() {
        String sql = "select * from table_movie where date > ? order by date asc";

        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class), "2020-9-15");
        return list;
    }

    @Override
    public List<Movie> findFilmsByScore() {
        String sql = "select * from table_movie order by score desc";
        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class));
        return list;
    }

    @Override
    public List<Movie> findNewestFilmsByDate() {
        String sql = "select * from table_movie where date < ? order by date desc";

        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class), "2020-9-15");
        return list;
    }
}
