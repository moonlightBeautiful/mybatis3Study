package com.java1234.c06annotate.mappers;

import com.java1234.c06annotate.model.ProcessFlow;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 */
public interface ProcessFlowMapper {
    @Select("select * from t_processFlow where id=#{id}")
    public ProcessFlow selectProcessFlowById(Integer id);

    @Select("select * from t_processFlow where id=#{id}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "id", property = "operations", many = @Many(select = "com.java1234" +
                            ".c06annotate.com.java1234.mappers" +
                            ".OperationMapper.selectOprationsByProcessFlowId"))
            }
    )
    public ProcessFlow selectProcessFlowByIdWithOperations(Integer id);

}
