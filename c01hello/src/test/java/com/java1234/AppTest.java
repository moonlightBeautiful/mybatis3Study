package com.java1234;

import static org.junit.Assert.assertTrue;

import com.java1234.mappers.StudentMapper;
import com.java1234.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class AppTest {
    private static Logger logger = Logger.getLogger(AppTest.class);
    private SqlSession sqlSession = null;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();

    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testHello() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("李四", 12);
        int result = studentMapper.add(student);
        if (result > 0) {
            logger.info("向日志写入的信息：添加学生成功！");
        }
    }

}
