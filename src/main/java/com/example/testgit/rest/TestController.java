package com.example.testgit.rest;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.testgit.dao.UserDao;
import com.example.testgit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserDao userDao;

    @GetMapping("/listUser")
    public Object listUser() {


        List<User> users = userDao.selectList(null);


        //List<User> list = new ArrayList<User>();
        //list.add(new User("zx", 11));
        //list.add(new User("ls", 32));
        //list.add(new User("ww", 20));
        return users;
    }
}
