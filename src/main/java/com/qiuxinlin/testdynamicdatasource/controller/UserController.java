package com.qiuxinlin.testdynamicdatasource.controller;

import com.qiuxinlin.testdynamicdatasource.entity.User;
import com.qiuxinlin.testdynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: qiuxinlin
 * @Dercription:
 * @Date: 16:47 2018/11/28
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/selectUsersFromDs")
    public List selectUsersFromDs() {
        return userService.selectUsersFromDs();
    }

    @GetMapping("/selectUserFromDsGroup")
    public List selectUserFromDsGroup() {
        return userService.selectUserFromDsGroup();
    }

    @PostMapping("/addUserToSlave1")
    public void addUserToSlave1(@RequestBody User user) {
        userService.addUserToSlave1(user);
    }

    @PostMapping("/addUserToSlave2")
    public void addUserToSlave2(@RequestBody User user) {
        userService.addUserToSlave2(user);
    }
}
