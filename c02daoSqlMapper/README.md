#xmlSql映射器
简介：
    用xml文件映射dao接口，实现其方法。
    xml文件映射dao接口
        <mapper namespace="dao接口全路径">
            <crud相关标签 id="dao方法名" parameterType="入参类型" resultType="返回数据类型">
                sql语句，取入参#{入参名}
            </crud相关标签>
        </mapper> 
    当返回数据是List<Bean>类型，预先定义返回类型
        <resultMap type="Bean类" id="随便取标识">
       		<id property="Bean类id" column="对应表字段"/>
       		<result property="Bean类其他属性" column="对应表字段"/>
       		<result property="Bean类其他属性" column="对应表字段"/>
       	</resultMap>
crud示例：
    insert：
        <insert id="方法名" parameterType="入参类型">
            insert into t_student values(null,#{name},#{age})
        </insert>
    delete
        <delete id="delete" parameterType="Integer">
            delete from t_student where id=#{id}
        </delete>    
    update
        <update id="update" parameterType="Student">
            update t_student set name=#{name},age=#{age} where id=#{id}
        </update>
    select
        <select id="findById" parameterType="Integer" resultType="Student">
            select * from t_student where id=#{id}
        </select>
        <select id="find" resultMap="StudentResult 配置的list<bean>">
            select * from t_student
        </select>
    
    
    
    	
    	
    	
    	
    	