package com.ims.c04dynamicSql.mappers;


import com.ims.c04dynamicSql.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public List<Student> searchStudentsIf(Map<String, Object> map);

    public List<Student> searchStudentsChose(Map<String, Object> map);

    public List<Student> searchStudentsWhere(Map<String, Object> map);

    public List<Student> searchStudentsTrim(Map<String, Object> map);

    public List<Student> searchStudentsForeach(Map<String, Object> map);

    public int updateStudentSet(Student student);
}