crud
    简介：
        用xml文件映射dao接口，实现其方法。
    使用：
        映射dao接口：
            <mapper namespace="dao接口全路径">
        List<bean>配置：
        	<resultMap type="Student" id="StudentResult">
        		<id property="id" column="id"/>
        		<result property="name" column="name"/>
        		<result property="age" column="age"/>
        	</resultMap>
        insert：取bean属性  #{属性}
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
    
    
    
    	
    	
    	
    	
    	