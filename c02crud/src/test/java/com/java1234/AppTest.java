package com.java1234;

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

import java.io.InputStream;
import java.util.List;


public class AppTest {
    private static Logger logger = Logger.getLogger(AppTest.class);
    private SqlSession sqlSession = null;
    private StudentMapper studentMapper = null;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);

    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAdd() {
        logger.info("添加学生");
        Student student = new Student("王五", 12);
        studentMapper.add(student);
    }

    @Test
    public void testUpdate() {
        logger.info("修改学生");
        Student student = new Student(8, "王五2", 13);
        studentMapper.update(student);
        sqlSession.commit();
    }

    @ Test
    public void testDelete() {
        logger.info("删除学生");
        studentMapper.delete(8);
        sqlSession.commit();
    }

   @Test
    public void testFindById() {
        logger.info("通过ID查找学生");
        Student student = studentMapper.findById(1);
        System.out.println(student);
    }

    @Test
    public void testFind() {
        logger.info("查找所有学生");
        List<Student> studentList = studentMapper.find();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

}
