package com.example.testgit.rest;


import com.example.testgit.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/listUser")
    public Object listUser() {
        List<User> list = new ArrayList<User>();
        list.add(new User("zx", 11));
        list.add(new User("ls", 32));
        list.add(new User("ww", 20));
        return list;
    }
}
