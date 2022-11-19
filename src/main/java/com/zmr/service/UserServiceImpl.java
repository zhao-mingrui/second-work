package com.zmr.service;

import com.zmr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void testAnnotation() {
        System.out.println("测试注解注入--UserService");
        userDao.testAnnotation();
    }
}
