package com.java1234.c06annotate.mappers;

import com.java1234.c06annotate.model.Author;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 */
public interface AuthorMapper {

    /**
     * 一对一映射
     * 根据作者的id查询出作者
     *
     * @param id
     * @return
     */
    @Select("select * from t_author where id=#{id}")
    public Author findById(Integer id);
}
