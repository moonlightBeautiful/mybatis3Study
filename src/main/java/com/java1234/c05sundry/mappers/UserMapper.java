package com.java1234.c05sundry.mappers;

import com.java1234.c05sundry.model.User;

import java.util.List;

public interface UserMapper {


    public int insertStudent(User student);

    public User getStudentById(Integer id);

    public List<User> searchStudentsMultiParam(String name, int age);
}
