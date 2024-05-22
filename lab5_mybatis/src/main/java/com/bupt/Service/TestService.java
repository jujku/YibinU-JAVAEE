package com.bupt.Service;

import com.bupt.enity.User;


public interface TestService {
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);
}
