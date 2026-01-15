package org.example.demospring2.proxy;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void login(){
        System.out.println("login");
    }

    public void logout(){
        System.out.println("logout");
    }
}
