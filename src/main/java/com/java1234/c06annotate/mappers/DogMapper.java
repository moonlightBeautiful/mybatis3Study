package com.java1234.c06annotate.mappers;

import com.java1234.c06annotate.model.Dog;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DogMapper {

    @Insert("insert into t_dog values(null,#{name},#{age})")
    public int insertDog(Dog dog);

    @Update("update t_dog set name=#{name},age=#{age} where id=#{id}")
    public int updateDog(Dog dog);

    @Delete("delete from t_dog where id=#{id}")
    public int deleteDog(int id);

    @Select("select * from t_dog where id=#{id}")
    public Dog getDogById(Integer id);

    @Select("select * from t_dog")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "age", property = "age")
            }
    )
    public List<Dog> findDogs();

}
