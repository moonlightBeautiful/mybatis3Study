package com.java1234.c05sundry.mappers;

import com.java1234.c05sundry.model.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    public int insertUser(User student);

    public User getUserById(Integer id);

    public List<User> searchUsersMultiParam(String name, int age);

    /**
     * 物理分页：mybatis内置的功能，一次性全部读取出来放到内存再分页
     *
     * @param rowBounds
     * @return
     */
    public List<User> findUsersByPhysicalPaging(RowBounds rowBounds);

    /**
     * 逻辑分页：就是在sql中使用limit
     *
     * @param map
     * @return
     */
    public List<User> findUsersByLogicalPaging(Map<String, Object> map);
}
