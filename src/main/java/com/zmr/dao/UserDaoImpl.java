package com.zmr.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void testAnnotation() {
        System.out.println("测试注解注入--UserDao");
    }
}
