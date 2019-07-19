1.mybatis hello 
    orm框架，用映射文件来映射dao类，在映射文件写sql语句
2.标签解读
    1.环境
         <environments  default="development">
                <environment id="development">
                    <transactionManager type="JDBC | MANAGED" />
                    <dataSource type="POOLED">
                        <property name="driver" value="${jdbc.driverClassName}" />
                        <property name="url" value="${jdbc.url}" />
                        <property name="username" value="${jdbc.username}" />
                        <property name="password" value="${jdbc.password}" />
                     </dataSource>
                </environment>
         <environments>
    2.属性配置
          第一种：引入properties文件
               <properties resource="properties文件"/> 
          第二种：手动写配置
               <properties> 
                   <property name="" value="">
               </properties> 
          使用：${定义的属性}
    3.类型别名
         第一种：扫描包自动取别名，别名就是类的名字。
              <typeAliases> 
                   <package name=" 包的路径"/>  
              </typeAliases>
         第二种：依次配置
               <typeAliases> 
                   <typeAlias alias="Student 别名" type="model类的路径"/>
               </typeAliases>
    4.引入映射文件
        第一种：引入具体的映射文件或者类
            <mappers>
                <mapper resource="路径.xml" />    //第一种的第1.1种
         	    <mapper class="路径.,mapper类名(无java后缀)" />        //第一种的第1.2种
            </mappers> 
        第二种：扫描包自动引入映射文件。
             <mappers>
                 <package name="mapper.xml包路径" />
              </mappers>
    5.引入log4j
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