package com.ims.mapper;

import com.ims.model.Student;

import java.util.List;
import java.util.Map;


public interface StudentMapper {

    List<Student> searchStudentsUseIf(Map<String, Object> map);

    List<Student> searchStudentsUseWhen(Map<String, Object> map);

    List<Student> searchStudentsUseWhere(Map<String, Object> map);

    List<Student> searchStudentsUseTrim(Map<String, Object> map);

    List<Student> searchStudentsUseForeach(Map<String, Object> map);

    int updateStudentUseSet(Student student);
}
