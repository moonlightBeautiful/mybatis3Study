package com.ims.c02basicCrud.mappers;

import com.ims.c02basicCrud.model.Student;

import java.util.List;

public interface StudentMapper {

    //插入
    public int add(Student student);

    //更新
    public int update(Student student);

    //删除
    public int delete(Integer id);

    //查询
    public Student findById(Integer id);

    //查询
    public List<Student> find();
}
