package com.ims;

import com.ims.mappers.StudentMapper;
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
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc: 请对类进行描述
 */
public class App {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(App.class);
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        /**
         * 增
         */
        /*Student student = new Student("王五", 12);
        studentMapper.add(student);
        logger.info("添加学生！"+student);*/

        /**
         * 删
         */
        /*studentMapper.delete(8);
        logger.info("删除学生!");*/

        /**
         * 改
         */
       /* Student student = new Student(11, "王五2", 13);
        studentMapper.update(student);
        logger.info("修改学生!");*/

        /**
         * 查1
         */
       /* Student student = studentMapper.findById(1);
        logger.info("通过ID查找学生!" + student);*/
        /**
         * 查2
         */
        /*List<Student> studentList = studentMapper.findAll();
        for (Student s : studentList) {
            logger.info("查找所有学生!" + s);
        }*/


        sqlSession.commit();
        sqlSession.close();
    }
}
