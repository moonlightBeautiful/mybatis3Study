package com.ims.mappers;

import java.util.List;

import com.ims.model.Student;

public interface StudentMapper {

	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(Integer id);
	
	public Student findById(Integer id);
	
	public List<Student> findAll();
}
