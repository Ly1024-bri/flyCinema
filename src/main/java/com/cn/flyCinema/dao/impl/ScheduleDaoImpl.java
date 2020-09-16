package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.ScheduleDao;
import com.cn.flyCinema.entity.Schedule;
import com.cn.flyCinema.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ScheduleDaoImpl implements ScheduleDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public Schedule findScheduleBySid(Integer sid) {
        String sql = "select * from table_schedule where sid = ?";

        List<Schedule> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Schedule.class), sid);

        return list.size() == 0 ? null : list.get(0);
    }
}
