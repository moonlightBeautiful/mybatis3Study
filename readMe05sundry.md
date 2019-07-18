1.clob和blob数据
    java中byte[]    对应mysql  longblob
          String    对应mysql longtext
2.多参数
    基本数据类型：#{param1} #{param2} #{param3}
    Map和javabean类型：猜测    #{param1.属性}      
3.分页
    逻辑分页：内置功能RowBounds，一次性把全部数据全部取出来放到内存，从内存中分页取出来
    物理分页：自己sql，limit n,n
4.缓存
    并发量大且是查询的情况下，然后服务器内存高一点，减轻数据库的压力，这样速度快。一般项目用不到，了解即可
    MyBatis默认的情况下，启用的是一级缓存，即同一个SqlSession接口对象调用相同的select语句情况下，则直接从缓存中返回结果，而不是再查询一次数据库。针对某一用户。
    开发者可以使用二级缓存，二级缓存是全局的。针对全部用户。
    <!--
        	1，size:表示缓存能容纳的最大元素数。默认是1024；
        	2，flushInterval:定义缓存刷新周期，以毫秒计；
         	3，eviction:定义缓存的移除机制；默认是LRU(least recently userd，最近最少使用),还有FIFO(first in first out，先进先出)
         	4，readOnly:默认值是false，缓存可读可写，假如是true的话，缓存只能读。
    -->
    <cache size="1024" flushInterval="60000" eviction="LRU" readOnly="false"/>
    默认情况下， select（读）使用缓存，即select标签默认使用。insert update delete（写）不使用缓存，即update和delete和insert标签默认使用。

   
