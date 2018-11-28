package com.qiuxinlin.testdynamicdatasource.service;


import com.qiuxinlin.testdynamicdatasource.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List selectUsersFromDs();

    List selectUserFromDsGroup();
}
