package com.java1234.c05sundry;

import com.java1234.c05sundry.mappers.UserMapper;
import com.java1234.c05sundry.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
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
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            //
            User user = new User();
            user.setName("张三4");
            user.setAge(14);
            user.setRemark("很长的本文...");
            byte[] pic = null;
            try {
                File file = new File("c://boy.jpg");
                InputStream fileInputStream = new FileInputStream(file);
                pic = new byte[fileInputStream.available()];
                fileInputStream.read(pic);
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            user.setPic(pic);
            userMapper.insertStudent(user);
            sqlSession.commit();

            //
            Student student = studentMapper.getStudentById(4);
            System.out.println(student);
        } catc byte[] pic = student.getPic();
        h(IOException e) {
            e. try {
                printStackTrace();
            } fina File file = new File("d://boy2.jpg");
            lly {
                sq OutputStream outputStream = new FileOutputStream(file);
                lSession.close();
            } outputStream.write(pic);
        } outputStream.close();
    }catch(
    Exception e)

    {
        e.printStackTrace();
    }

    logger.info("添加学生(带条件)");
}
    List<Student> studentList = studentMapper.searchStudents6("%3%", 12);
    		for(Student student:studentList){