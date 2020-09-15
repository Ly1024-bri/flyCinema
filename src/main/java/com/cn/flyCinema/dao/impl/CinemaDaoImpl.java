package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.CinemaDao;
import com.cn.flyCinema.entity.Cinema;
import com.cn.flyCinema.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;

public class CinemaDaoImpl implements CinemaDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Cinema> findCinema(int aid) {

        String sql = "select * from table_cinema where aid =?";


        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Cinema.class),aid);
    }
}
