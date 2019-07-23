package com.java1234.c06annotate.mappers;

import com.java1234.c06annotate.model.Cat;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;
import java.util.Map;

/**
 * @author gaoxu
 * @date 2019-07-23 13:01
 * @description ... 类
 * 动态sql crud
 */
public interface CatMapper {

    @InsertProvider(type = CatDynaSqlProvider.class, method = "insertCat")
    public int insertCat(Cat student);

    @UpdateProvider(type = CatDynaSqlProvider.class, method = "updateCat")
    public int updateCat(Cat student);

    @DeleteProvider(type = CatDynaSqlProvider.class, method = "deleteCat")
    public int deleteCat(int id);

    @SelectProvider(type = CatDynaSqlProvider.class, method = "getCatById")
    public Cat getCatById(Integer id);

    @SelectProvider(type = CatDynaSqlProvider.class, method = "findCats")
    public List<Cat> findCats(Map<String, Object> map);
}
