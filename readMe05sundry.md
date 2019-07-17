1.clob和blob数据
    java中byte[]    对应mysql  longblob
          String    对应mysql longtext
2.多参数
    基本数据类型：#{param1} #{param2} #{param3}
    Map和javabean类型：猜测    #{param1.属性}      
3.分页
    逻辑分页：内置功能RowBounds，一次性把全部数据全部取出来放到内存，从内存中分页取出来
    物理分页：自己sql，limit n,n

   
