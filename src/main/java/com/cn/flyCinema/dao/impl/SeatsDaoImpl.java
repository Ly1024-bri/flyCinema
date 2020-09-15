package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.SeatsDao;
import com.cn.flyCinema.entity.Seating;
import com.cn.flyCinema.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class  SeatsDaoImpl implements SeatsDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Seating> getAllSeats(Integer sid) {
        String sql = "select * from table_seating where sid = ?";

        List<Seating> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Seating.class), sid);

        return list;
    }
}
