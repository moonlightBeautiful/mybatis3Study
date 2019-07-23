package com.java1234.c06annotate.mappers;

import com.java1234.c06annotate.model.Operation;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gaoxu
 * @date 2019-07-22 18:20
 * @description ... 类
 */
public interface OperationMapper {

    @Select("select * from t_operation where processFlowId=#{processFlowId}")
    public List<Operation> selectOprationsByProcessFlowId(int processFlowId);

    @Select("select * from t_operation where id=#{id}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "age", property = "age"),
                    @Result(column = "processFlowId", property = "processFlow", one = @One(select = "com.java1234" +
                            ".c06annotate.mappers" +
                            ".ProcessFlowMapper" +
                            ".selectProcessFlowById")),
            }
    )
    public Operation selectOperationByIdWithProcessFlow(int id);
}
