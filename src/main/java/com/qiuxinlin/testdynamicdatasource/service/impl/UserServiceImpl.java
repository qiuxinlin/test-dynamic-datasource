package com.qiuxinlin.testdynamicdatasource.service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.qiuxinlin.testdynamicdatasource.entity.User;
import com.qiuxinlin.testdynamicdatasource.mapper.UserMapper;
import com.qiuxinlin.testdynamicdatasource.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user.getName(), user.getAge());
    }

    @DS("slave_1")
    @Override
    public List selectUsersFromDs() {
        return userMapper.selectUsers(1);
    }

    @DS("slave")
    @Override
    public List selectUserFromDsGroup() {
        return userMapper.selectUsers(1);
    }
}
