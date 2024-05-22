package com.bupt.Service.impl;

import com.bupt.Service.TestService;
import com.bupt.enity.User;
import com.bupt.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public void addUser(User user){
        testMapper.addUser(user);
    }
    @Override
    public void deleteUser (int id){
        testMapper.deleteUser(id);
    }
    @Override
    public void updateUser (User user){
        testMapper.updateUser(user);
    }

    @Override
    public User getUserById (int id){
        User user = testMapper.getUserById(id);
        return user;
    }
}
