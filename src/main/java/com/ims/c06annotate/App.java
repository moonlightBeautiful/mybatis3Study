package com.ims.c06annotate;

import com.ims.c06annotate.mappers.CatMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

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
            //注解式crud
            /* DogMapper dogMapper = sqlSession.getMapper(DogMapper.class);*/
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
            /*logger.info("查询小狗");
            List<Dog> dogList = dogMapper.findDogs();
            for (Dog dog : dogList) {
                System.out.println(dog);
            }*/
            //注解式关系
            //一对一（单向）
            /*logger.info("查找书籍(带作者)");
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            Book book = bookMapper.selectBookWithAuthor(3);
            System.out.println(book);*/
            //一对多（单向）
            /*logger.info("查找省(带市)");
            ProvinceMapper provinceMapper = sqlSession.getMapper(ProvinceMapper.class);
            Province province = provinceMapper.findById(1);
            System.out.println(province);*/
            //一对一和一对多（双向）
            /*logger.info("查找工序(带工艺)");
            OperationMapper operationMapper = sqlSession.getMapper(OperationMapper.class);
            Operation operation = operationMapper.selectOperationByIdWithProcessFlow(1);
            System.out.println(operation);
            logger.info("查找工艺(带工序)");
            ProcessFlowMapper processFlowMapper = sqlSession.getMapper(ProcessFlowMapper.class);
            ProcessFlow processFlow = processFlowMapper.selectProcessFlowByIdWithOperations(1);
            System.out.println(processFlow);*/
            //注解式 动态sql crud
            CatMapper catMapper = sqlSession.getMapper(CatMapper.class);
            //动态sql插入
            /*logger.info("动态sql插入小猫D");
            Cat cat = new Cat("小猫D", 1);
            int i = catMapper.insertCat(cat);
            sqlSession.commit();
            System.out.println(i);*/
            //动态sql查询,根据id
            /*logger.info("动态sql查询id为1的小猫");
            Cat cat = catMapper.getCatById(1);
            System.out.println(cat);*/
            //动态sql查询,根据name和age，name模糊
            /*logger.info("动态sql查询name模糊为小猫，age=2的小猫");
            Map map = new HashMap<String, Object>();
            map.put("name","小猫");
            map.put("age",2);
            List<Cat> cats = catMapper.findCats(map);
            for (Cat cat : cats) {
                System.out.println(cat);
            }*/
            //动态sql更新
            /*logger.info("动态sql更新小猫D");
            Cat cat = new Cat(13, "小猫D", 13);
            int i = catMapper.updateCat(cat);
            sqlSession.commit();
            System.out.println(i);*/
            //动态sql删除
            logger.info("动态sql删除小猫D");
            int i = catMapper.deleteCat(13);
            sqlSession.commit();
            System.out.println(i);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}