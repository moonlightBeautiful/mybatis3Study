package com.java1234.c05sundry.mappers;

import com.java1234.c05sundry.model.User;

import java.util.List;

public interface UserMapper {


    public int insertUser(User student);

    public User getUserById(Integer id);

    public List<User> searchUsersMultiParam(String name, int age);
}
