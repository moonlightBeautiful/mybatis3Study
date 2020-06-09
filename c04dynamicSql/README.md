#动态sql
简介
    入参为map类型，mapperXML文件中，取入参：#{key} 或者 动态sql标签中直接使用key
1.if
    示例：
        <select id="searchStudentsUseIf" parameterType="Map" resultMap="StudentResult">
            select * from t_student
            where gradeId=#{gradeId}
            <if test="name!=null">
                and name like #{name}
            </if>
            <if test="age!=nulll">
                and age=#{age}
            </if>
        </select>
2.choose + when + otherwise
    示例：
        <select id="searchStudentsUseWhen" parameterType="Map" resultMap="StudentResult">
            select * from t_student
            <choose>
                <when test="searchBy=='gradeId'">
                    where gradeId=#{gradeId}
                </when>
                <when test="searchBy=='name'">
                    where name like #{name}
                </when>
                <otherwise>
                    where age=#{age}
                </otherwise>
            </choose>
        </select>       
3.where：常用
    1.自动加上where 
    2.去掉第一个where标签中的开头的or或者and
4.trim：不常用，
    提供了添加前缀和后缀的功能
    prefix：前缀
    prefixOverrides：去掉第一个
    suffix：后缀
    suffixOverrides：去掉最后一个
5.foreach
    item="gradeId"：集合中的项
    collection="gradeIds"：集合
    open="(" ：开头
    separator="," ：拼接符
    close=")"：接口
6.set:常用
    1.自动加上set
    2.自动去掉最后一个，逗号


   
