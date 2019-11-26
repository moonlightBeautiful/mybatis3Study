hello 
    简介：
        java持久层（orm）框架，面向dao层。hibernate是面向model层的。
        用映射文件来映射dao接口，在映射文件写sql语句实现dao方法。
    hello：
        1.引入需要的jar包:mybatis+mysql-connector-java+log4j
        2.mybatis配置文件：配置数据源+模型类起别名+dao映射文件引入
        3.模型类+dao类+dao映射文件
    主配置文件标签学习：
        1.environments：支持多个数据库环境
            <environments  default="选择使用的环境 environment的id">
                //数据库的环境，可以弄多个，由default属性指定使用哪一个
                <environment id="环境标识">
                     //事务管理器 JDBC，应用程序管理数据库的连接的生命周期  MANAGED，服务器管理数据库的连接的生命周期，付费的服务器才有，tomcat没有，jboss weblogic等有
                    <transactionManager type="JDBC | MANAGED" /> 
                     //数据源配置   UNPOOLED，没有连接池，每次操作数据库都会创建一个新的，适合小项目。 POOLED，使用连接池。  JNDI，使用应用服务器配置的JNDI数据源获取数据库连接。
                    <dataSource type="UNPOOLED | POOLED | JNDI">
                        <property name="driver" value="${jdbc.driverClassName}" />
                        <property name="url" value="${jdbc.url}" />
                        <property name="username" value="${jdbc.username}" />
                        <property name="password" value="${jdbc.password}" />
                     </dataSource>
                </environment>
            <environments>
        2.properties：配置属性，就是键值对，供主配置文件使用${key}，有2种实现方式   
            第一种：引入properties文件
                <properties resource="properties文件"/> 
            第二种：手动写配置属性
                <properties> 
                   <property name="" value="">
                </properties> 
        3.typeAliases：类型别名，给model类取别名。2种方式。
             第一种：扫描包自动取别名，默认别名就是类的名字。以后用这个
                  <typeAliases> 
                       <package name=" 包的路径"/>  
                  </typeAliases>
             第二种：依次指定具体配置
                   <typeAliases> 
                       <typeAlias alias="指定别名" type="model类的全路径"/>
                   </typeAliases>
        4.mappers引入DAO映射文件，2种方式
            第一种：引入具体的映射文件或者类
                <com.java1234.mappers>
                    <mapper resource="路径.xml" />    //第一种的第1.1种
                    <mapper class="路径.mapper类名" />        //第一种的第1.2种
                </com.java1234.mappers> 
            第二种：扫描包自动引入映射文件。
                 <com.java1234.mappers>
                     <package name="能找到mapper.xml文件的包路径" />
                  </com.java1234.mappers>
    引入log4j
        1.引入log4j.properties文件
            # 输出目标 2个
            log4j.rootLogger=info,appender1,appender2
            # 目标1，控制台	
            log4j.appender.appender1=org.apache.log4j.ConsoleAppender
            log4j.appender.appender1.layout=org.apache.log4j.TTCCLayout 	
            # 目标2，文件
            log4j.appender.appender2=org.apache.log4j.FileAppender 
            log4j.appender.appender2.File=C:/logFile.txt 
            log4j.appender.appender2.layout=org.apache.log4j.TTCCLayout 
        2.log4j的使用
            private static Logger logger=Logger.getLogger(StudentTest.class);
            logger.info("向日志写入的信息！"); 
