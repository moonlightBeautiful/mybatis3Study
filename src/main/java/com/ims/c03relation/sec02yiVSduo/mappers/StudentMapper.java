package com.ims.c03relation.sec02yiVSduo.mappers;

import com.ims.c03relation.sec02yiVSduo.model.Student;


public interface StudentMapper {

    public Student findByGradeId(Integer gradeId);
}
