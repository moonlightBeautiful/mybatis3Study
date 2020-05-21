package com.ims.c05sundry;

import com.ims.c05sundry.mappers.UserMapper;
import com.ims.c05sundry.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

            //添加用户：照片longblob（byte[]）和评论longtext（String）
            /*Dog user = new Dog();
            user.setName("张三4");
            user.setAge(14);
            user.setRemark("很长的本文...");
            byte[] pic = null;
            File file = new File("c://boy.jpg");
            InputStream fileInputStream = new FileInputStream(file);
            pic = new byte[fileInputStream.available()];
            fileInputStream.read(pic);
            fileInputStream.close();
            user.setPic(pic);
            logger.info("添加用户(照片longblob（byte[]）和评论longtext（String）)");
            userMapper.insertUser(user);
            sqlSession.commit();*/
            //查询用户：照片longblob（byte[]）和评论longtext（String）
            /*logger.info("查询用户(照片longblob（byte[]）和评论longtext（String）)");
            Dog user = userMapper.getUserById(5);
            System.out.println(user);
            byte[] pic = user.getPic();
            File file = new File("c://boy2.jpg");
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(pic);
            outputStream.close();*/
            //查询用户：多参数
           /* logger.info("查询用户(照片longblob（byte[]）和评论longtext（String）)，多参数");
            List<Dog> userList = userMapper.searchUsersMultiParam("%3%", 12);
            for (Dog user : userList) {
                System.out.println(user);
            }*/
            //物理分页
            /*logger.info("查询用户，物理分页");
            int offset = 0, limit = 3;
            RowBounds rowBounds = new RowBounds(offset, limit);
            List<Dog> userList = userMapper.findUsersByPhysicalPaging(rowBounds);
            for (Dog user : userList) {
                System.out.println(user);
            }*/
            //逻辑分页
            logger.info("查询用户，逻辑分页");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("start", 1);
            map.put("size", 3);
            List<User> userList = userMapper.findUsersByLogicalPaging(map);
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}