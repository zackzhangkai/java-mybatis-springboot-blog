package com.example.demo.dao;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    public List<User> listUser();
    public List<User>listUserByName(UserQuery userQuery);
}
