package com.cn.flyCinema.service.impl;

import com.cn.flyCinema.dao.UserDao;
import com.cn.flyCinema.dao.impl.UserDaoImpl;
import com.cn.flyCinema.entity.User;
import com.cn.flyCinema.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao ud = new UserDaoImpl();
    @Override
    public User findUser(String username, String password) {
        User user =ud.findUserByUP(username,password);
        return user;
    }

    @Override
    public boolean reg(User user) {
        int count = ud.addUser(user);
        return count!=0;
    }

    @Override
    public boolean findUserByUname(String username) {
        int count = ud.findUserByName(username);
        return count==0;
    }

    @Override
    public void update(User user) {
        ud.updateUser(user);
    }
}
