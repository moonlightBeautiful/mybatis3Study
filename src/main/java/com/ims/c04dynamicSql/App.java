package com.ims.c04dynamicSql;

import com.ims.c04dynamicSql.mappers.StudentMapper;
import com.ims.c04dynamicSql.model.Student;
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
            // if条件的查询
            /*Map<String, Object> map = new HashMap<String, Object>();
            map.put("gradeId", 2);
            // map.put("name", "%李%");
            // map.put("age", 11);
            logger.info("查询学生(带条件if)");
            List<Student> result = studentMapper.searchStudentsIf(map);
            for (Student student : result) {
                System.out.println(student);
            }*/

            // chose条件的查询
          /*  Map<String, Object> map = new HashMap<String, Object>();
            map.put("searchBy", "age");
            map.put("gradeId", 2);
            map.put("name", "%李%");
            map.put("age", 11);
            logger.info("查询学生(带条件chose)");
            List<Student> studentList = studentMapper.searchStudentsChose(map);
            for (Student student : studentList) {
                System.out.println(student);
            }*/

            // where条件的查询
            /*logger.info("查询学生(带条件where)");
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("gradeId", 2);
            map.put("name", "%李%");
            map.put("age", 11);
            List<Student> studentList=studentMapper.searchStudentsWhere(map);
            for(Student student:studentList){
                System.out.println(student);
            }*/

            // trim条件的查询
            /*logger.info("查询学生(带条件trim)");
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("gradeId", 2);
            // map.put("name", "%李%");
             map.put("age", 11);
            List<Student> studentList=studentMapper.searchStudentsTrim(map);
            for(Student student:studentList){
                System.out.println(student);
            }*/

            // foreach条件的查询，一般是范围查询 字段in(1,2,3,4)
            /*logger.info("查询学生(带条件foreach)");
            Map<String, Object> map = new HashMap<String, Object>();
            List<Integer> gradeIds = new ArrayList<Integer>();
            gradeIds.add(1);
            gradeIds.add(2);
            map.put("gradeIds", gradeIds);
            List<Student> studentList = studentMapper.searchStudentsForeach(map);
            for (Student student : studentList) {
                System.out.println(student);
            }*/

            // set条件的更新
            logger.info("更新学生(带条件set)");
            Student student = new Student();
            student.setId(1);
            student.setName("张三3");
            student.setAge(13);
            int result = studentMapper.updateStudentSet(student);
            sqlSession.commit();
            if (result > 0) {
                System.out.println("更新学生成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


}
