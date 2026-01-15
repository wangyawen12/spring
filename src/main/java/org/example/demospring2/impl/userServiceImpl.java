package org.example.demospring2.impl;

import org.example.demospring2.dao.Dao;
import org.example.demospring2.pojo.User;
import org.example.demospring2.service.UserService;

public class userServiceImpl implements UserService {
    Dao dao;
    public userServiceImpl(Dao dao){
        this.dao = dao;
    }
    @Override
    public User login(User user) {
        return dao.getUser(user);
    }
}
