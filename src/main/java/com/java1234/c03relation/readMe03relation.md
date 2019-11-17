1.一对一关系，比如：学生和地址，一个学生对应一个地址。
    模型的关系：一的一方有一的一方的属性。
    表的关系：一的一方有外键。
    mybatis实现方式：
       resultMap 定义，只能在定义的mapper文件中使用。
        1. <resultMap type="" id=""> 中属性使用级联
                 <result property="对象.属性" column=""/>
        2. <resultMap type="" id=""> association对象resultMap
                <resultMap type="" id="单独定义的resultMap">
                <resultMap type="" id="">
                    <association property="address" resultMap="单独定义的resultMap"/>
        3. <resultMap type="" id=""> 中association内置使用对象类型属性
                <association property="address" javaType="对象类型">
                    <result property="对象类型属性" column="id"/>
        4. <resultMap type="" id=""> 中 association对象mapper中的方法
                <association property="对象类型" column="外键" select="包路径.com.java1234.mappers.AddressMapper
                .根据外键(对象类型的主键)查询对象类型"></association>
                
2.一对多关系，比如：学生和年级，一个年级可以可以对应多个学生。
    模型的关系：多的一方有List<一的一方>属性。
    表的关系：一的一方有外键。
   
