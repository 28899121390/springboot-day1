package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> queryAll() {

        List<User> users = userDao.queryAll();
        System.out.println("this is queryAll");

        return users;
    }

    @Override
    public void save(User user) {

            userDao.save(user);
        Date date1 = new Date();

    }
}
