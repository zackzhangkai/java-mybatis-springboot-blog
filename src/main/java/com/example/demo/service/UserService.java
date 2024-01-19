package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    public List<User> listUser();
    public PageInfo<User> listUserByName(UserQuery userQuery);
}
