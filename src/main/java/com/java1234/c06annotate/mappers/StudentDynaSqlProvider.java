/*
package com.java1234.c06annotate.mappers;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.java1234.model.Student;

public class StudentDynaSqlProvider {

	public String insertStudent(final Student student){
		return new SQL(){
			{
				INSERT_INTO("t_student");
				if(student.getName()!=null){
					VALUES("name", "#{name}");
				}
				if(student.getAge()!=null){
					VALUES("age", "#{age}");
				}
			}
		}.toString();
	}
	
	public String updateStudent(final Student student){
		return new SQL(){
			{
				UPDATE("t_student");
				if(student.getName()!=null){
					SET("name=#{name}");
				}
				if(student.getAge()!=null){
					SET("age=#{age}");
				}
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String deleteStudent(){
		return new SQL(){
			{
				DELETE_FROM("t_student");
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String getStudentById(){
		return new SQL(){
			{
				SELECT("*");
				FROM("t_student");
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String findStudents(final Map<String,Object> map){
		return new SQL(){
			{
				SELECT("*");
				FROM("t_student");
				StringBuffer sb=new StringBuffer();
				if(map.get("name")!=null){
					sb.append(" and name like '"+map.get("name")+"'");
				}
				if(map.get("age")!=null){
					sb.append(" and age="+map.get("age"));
				}
				if(!sb.toString().equals("")){
					WHERE(sb.toString().replaceFirst("and", ""));					
				}
			}
		}.toString();
	}
}
*/
