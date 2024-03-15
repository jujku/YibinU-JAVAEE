package org.example;
import com.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userservice = new UserService();
        userservice.sayHello();
    }
}