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

public class App {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(App.class);
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("李四", 122);
        int result = studentMapper.add(student);
        if (result > 0) {
            logger.info("向日志写入的信息：添加学生成功！");
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
