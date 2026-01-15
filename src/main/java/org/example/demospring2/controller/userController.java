package org.example.demospring2.controller;

import org.example.demospring2.pojo.User;
import org.example.demospring2.service.UserService;

public class userController {

    UserService userService;

    public boolean login(){
        String username = "admin";
        String password = "123";

        User user1 = new User();
        user1.setUsername(username);
        user1.setPassword(password);
        User result = userService.login(user1);

        if(result==null){
            return false;
        }
        return true;


    }
}
