/*
package com.java1234.c06annotate.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.java1234.model.Student;


public interface StudentMapper {

	@InsertProvider(type=StudentDynaSqlProvider.class,method="insertStudent")
	public int insertStudent(Student student);
	
	@UpdateProvider(type=StudentDynaSqlProvider.class,method="updateStudent")
	public int updateStudent(Student student);
	
	@DeleteProvider(type=StudentDynaSqlProvider.class,method="deleteStudent")
	public int deleteStudent(int id);
	
	@SelectProvider(type=StudentDynaSqlProvider.class,method="getStudentById")
	public Student getStudentById(Integer id);
	
	@SelectProvider(type=StudentDynaSqlProvider.class,method="findStudents")
	public List<Student> findStudents(Map<String, Object> map);
	
}
*/
