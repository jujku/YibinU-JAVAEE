package com.bupt.mapper;

import com.bupt.enity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    int addUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    User getUserById(int id);
}
