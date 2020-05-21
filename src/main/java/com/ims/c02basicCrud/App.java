package com.ims.c02basicCrud;


import com.ims.c02basicCrud.mappers.StudentMapper;
import com.ims.c02basicCrud.model.Student;
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

    private static Logger logger = Logger.getLogger(com.ims.c01hello.App.class);

    public static void main(String[] args) {
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        Student student = null;
        int result = 0;

        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            //插入操作==========================================================
         /*    logger.info("添加学生");
            student = new Student("王五", 12);
            result = studentMapper.add(student);
            sqlSession.commit();
            if (result > 0) {
                logger.info("添加成功！");
                System.out.println("添加成功！");
            }*/
            //修改操作==========================================================
          /*  logger.info("修改学生");
            student = new Student(8, "王五2", 13);
            result = studentMapper.update(student);
            sqlSession.commit();
            if (result > 0) {
                logger.info("修改成功！");
                System.out.println("修改成功！");
            }*/
            //删除操作==========================================================
            /*logger.info("删除学生");
            result = studentMapper.delete(8);
            sqlSession.commit();if (result > 0) {
                logger.info("删除成功！");
                System.out.println("删除成功！");
            }*/
            //查询操作==========================================================
            /*logger.info("通过ID查找学生");
            student = studentMapper.findById(1);
            if (student != null) {
                logger.info("通过ID查找学生成功");
                System.out.println(student);
            }*/
            //查询操作==========================================================
            logger.info("查找所有学生");
            List<Student> studentList = studentMapper.find();
            if (studentList != null && studentList.size() > 0) {
                logger.info("查找所有学生成功");
                for (Student s : studentList) {
                    System.out.println(s);
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
