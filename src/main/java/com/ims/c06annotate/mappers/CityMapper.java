package com.ims.c06annotate.mappers;

import com.ims.c06annotate.model.City;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 * 一对多映射(单向):city-province
 */
public interface CityMapper {

    /**
     * 一对多映射(单向):city-province
     * 根据省的id查询城市
     *
     * @param provinceId
     * @return
     */
    @Select("select * from t_city where provinceId=#{provinceId}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
            }
    )
    public List<City> selectCitiesByProvinceId(int provinceId);
}
