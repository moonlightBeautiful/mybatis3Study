package com.ims;

import com.ims.mapper.StudentMapper;
import com.ims.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: GaoXu
 * @date: 2020/6/9 9:01
 * @Description: (用一句话描述该文件做什么)
 */
public class App {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(App.class);
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        /**
         * if
         */
        /*logger.info("动态sql，if条件查询学生！");
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("gradeId", 2);
        // map.put("name", "%张三%");
        // map.put("age", 11);
        List<Student> studentList=studentMapper.searchStudentsUseIf(map);
        for(Student student:studentList){
            System.out.println(student);
        }*/

        /**
         * choose + when + otherwise
         */
        /*logger.info("动态sql，choose + when + otherwise条件查询学生！");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("searchBy", "age");
        map.put("gradeId", 2);
        map.put("name", "%张三%");
        map.put("age", 11);
        List<Student> studentList = studentMapper.searchStudentsUseWhen(map);
        for (Student student : studentList) {
            System.out.println(student);
        }*/

        /**
         * where
         */
        /*logger.info("动态sql，where条件查询学生！");
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("gradeId", 2);
        map.put("name", "%李%");
        map.put("age", 11);
        List<Student> studentList=studentMapper.searchStudentsUseWhere(map);
        for(Student student:studentList){
            System.out.println(student);
        }*/


        /**
         * trim
         */
        /*logger.info("动态sql，trim条件查询学生！");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("gradeId", 2);
        map.put("name", "%李%");
        map.put("age", 11);
        List<Student> studentList = studentMapper.searchStudentsUseTrim(map);
        for (Student student : studentList) {
            System.out.println(student);
        }*/

        /**
         * foreach
         */
        /*logger.info("动态sql，foreach条件查询学生！");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> gradeIds = new ArrayList<Integer>();
        gradeIds.add(1);
        gradeIds.add(2);
        map.put("gradeIds", gradeIds);
        List<Student> studentList = studentMapper.searchStudentsUseForeach(map);
        for (Student student : studentList) {
            System.out.println(student);
        }*/
        /**
         * set
         */
        logger.info("动态sql，set条件查询学生！");
        Student student = new Student();
        student.setId(1);
        student.setName("张三3");
        student.setAge(13);
        int result = studentMapper.updateStudentUseSet(student);
        sqlSession.commit();
        if (result > 0) {
            System.out.println("更新学生成功");
        }



        sqlSession.close();
    }
}
