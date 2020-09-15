package com.cn.flyCinema.dao;

import com.cn.flyCinema.entity.User;

public interface UserDao {
    User findUserByUP(String username, String password);

    int addUser(User user);

    User findUserByName(String username);

    void updateUser(User user);


    int active(String code);
}
