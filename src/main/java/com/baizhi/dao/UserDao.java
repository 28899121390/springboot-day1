package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> queryAll();

    public void save(User user);
}
