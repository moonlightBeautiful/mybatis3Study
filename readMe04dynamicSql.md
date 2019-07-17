传入的参数是map，mapper文件中，sql中#{key}使用 或者 标签中直接key 使用
1.if
2.chose when otherwise
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
    separator="," ：拼接
    close=")"：接口
6.set:常用
    1.自动加上set
    2.自动去掉最后一个，逗号


   
