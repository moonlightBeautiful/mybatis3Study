package com.ims.c06annotate.mappers;

import com.ims.c06annotate.model.Province;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 */
public interface ProvinceMapper {

    /**
     * 一对一映射
     * 根据作者的id查询出作者
     *
     * @param id
     * @return
     */
    @Select("select * from t_province where id=#{id}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "id", property = "cities", many = @Many(select = "com.java1234.c06annotate.com.java1234.mappers" +
                            ".CityMapper" +
                            ".selectProcessFlowById"))
            }
    )
    public Province findById(Integer id);
}
