package com.example.lydatashow.service.impl;
import com.example.lydatashow.mapper.UserMapper;
import com.example.lydatashow.model.User;
import com.example.lydatashow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.github.pagehelper.PageHelper;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }
}
