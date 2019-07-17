package com.java1234.c03relation.sec02yiVSduo;

import com.java1234.c03relation.sec02yiVSduo.mappers.GradeMapper;
import com.java1234.c03relation.sec02yiVSduo.model.Grade;
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
            GradeMapper gradeMapper = sqlSession.getMapper(GradeMapper.class);
            Grade grade = gradeMapper.findById(2);
            System.out.println(grade);
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


}
