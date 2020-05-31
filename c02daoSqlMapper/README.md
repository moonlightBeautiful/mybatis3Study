#xmlSql映射器
简介：
    用xml文件映射dao接口，实现其方法。
    xml文件映射dao接口
        <mapper namespace="dao接口全路径">
        </mapper> 
    引入映射三种方式
        1.引入具体的xml映射文件 
        2.引入具体的dao接口 
        3.扫描Mapper所在包自动引入(用这种方式)
使用：
    List<bean>配置：
        <resultMap type="Student" id="StudentResult">
            <id property="id" column="id"/>
            <result property="name" column="name"/>
            <result property="age" column="age"/>
        </resultMap>
    取bean对象属性：#{属性}
    insert：
        <insert id="方法名" parameterType="Student 入参"  >
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
    
    
    
    	
    	
    	
    	
    	