package com.ims.c06annotate.mappers;

import com.ims.c06annotate.model.Book;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 */
public interface BookMapper {


    /**
     * 一对一映射:book-author
     * 根据书的id查询出书和作者
     *
     * @param id book的id
     * @return
     */
    @Select("select * from t_book where id=#{id}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "authorId", property = "author", one = @One(select = "com.java1234.c06annotate.com.java1234.mappers" +
                            ".AuthorMapper" +
                            ".findById"))
            }
    )
    public Book selectBookWithAuthor(int id);
}
