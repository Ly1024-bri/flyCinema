package com.cn.flyCinema.dao.impl;

import com.cn.flyCinema.dao.UserDao;
import com.cn.flyCinema.entity.User;
import com.cn.flyCinema.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public User findUserByUP(String username, String password) {
        String sql = "select * from table_user where uname = ? and password = ?";
        List<User> user = jt.query(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        return user.isEmpty()?null:user.get(0);
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into table_user values(null,?,?,?,?,?)";
        int count = jt.update(sql, user.getUname(), user.getAge(), user.getBirthday(), user.getPassword(), user.getEmail());
        return count;
    }

    @Override
    public int findUserByName(String username) {
        String sql = "select * from table_user where uname = ?";
        int count = jt.queryForObject(sql, Integer.class, username);
        return count;
    }

    @Override
    public void updateUser(User user) {
        String sql = "update table_user set uname = ?, age = ?,birthday = ?,password = ?,email = ? where uid = ?";
        jt.update(sql,user.getUname(),user.getAge(),user.getBirthday(),user.getPassword(),user.getEmail(),user.getUid());
    }
}
