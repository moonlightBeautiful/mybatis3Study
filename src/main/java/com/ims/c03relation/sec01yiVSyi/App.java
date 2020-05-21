package com.ims.c03relation.sec01yiVSyi;

import com.ims.c03relation.sec01yiVSyi.mappers.StudentMapper;
import com.ims.c03relation.sec01yiVSyi.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 */
public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = studentMapper.findStudentWithAddress(1);
            System.out.println(student);
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


}
