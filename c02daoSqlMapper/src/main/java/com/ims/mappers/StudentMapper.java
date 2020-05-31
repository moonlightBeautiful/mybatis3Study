package com.ims.mappers;


import com.ims.model.Student;

import java.util.List;

public interface StudentMapper {

    int add(Student student);

    int update(Student student);

    int delete(Integer id);

    Student findById(Integer id);

    List<Student> find();
}
