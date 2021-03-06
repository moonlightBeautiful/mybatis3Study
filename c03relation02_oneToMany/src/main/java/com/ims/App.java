package com.ims;

import com.ims.mappers.GradeMapper;
import com.ims.mappers.StudentMapper;
import com.ims.model.Grade;
import com.ims.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(App.class);
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);


        Grade grade = gradeMapper.findById(2);
        logger.info("通过ID查找班级！" + grade);


        sqlSession.commit();
        sqlSession.close();
    }
}
