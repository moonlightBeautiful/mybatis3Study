package com.java1234.c06annotate;

import com.java1234.c06annotate.mappers.DogMapper;
import com.java1234.c06annotate.model.Dog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.List;

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
            DogMapper dogMapper = sqlSession.getMapper(DogMapper.class);

            //添加小狗
            /*Dog dog = new Dog();
            dog.setName("张三444");
            dog.setAge(14);
            logger.info("注解式添加小狗");
            dogMapper.insertDog(dog);
            sqlSession.commit();*/
            //更新小狗信息
            /*logger.info("更新小狗信息");
            Dog dog = new Dog(8, "8", 8);
            dogMapper.updateDog(dog);
            sqlSession.commit();*/
            //删除小狗
            /*logger.info("删除小狗");
            dogMapper.deleteDog(8);
            sqlSession.commit();*/
            //查询指定用户
            /*logger.info("查询指定小狗");
            Dog dog = dogMapper.getDogById(1);
            System.out.println(dog);*/
            //查询用户
            logger.info("查询小狗");
            List<Dog> dogList = dogMapper.findDogs();
            for (Dog dog : dogList) {
                System.out.println(dog);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}