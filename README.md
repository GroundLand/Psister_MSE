说明：数据没有采用外键模式

1.规范：<<阿里巴巴开发规范>> 可以去看看，不过大部分应该都和我们平时写的差不多
2.结构目录： 保留了你原本项目的结构目录
3.更改 
    1）增加了mybatis缓存机制-Ehcache作为缓存，Shiro也依赖Ehcache，后期考虑Redis作为主要缓存
    2）增加了本地日志配置和spring和mabitis日志级别控制
    3）修改jdbc.propertis为global.propertis 为今后引入全局配置 如niginx服务器配置,mq等
    4）修改basePackage 命名为com.cong命名(统一命名 取cl和long之意，如觉不适 可修改)
    5）修改底层 MVC 结构命名 详细可见目录结构，自己对比下
    6）增加spring-context-shiro文件，今后不再使用shiro.ini文件，
    7）统一mybitis配置 除了setting保留在mybitis-config.xml里面,其余都放在spring-context.xml里面
    8）增加了security
    9） 在web。xml中配置了druid的 观测路径
    .更多修改的内容，可以看git的 记录，因为时间原因，这里不再赘述了。如果有不合适的地方，可以讨论下
 项目主要更改内容，
 
    数据库：
    1.base_table
       我声明了，几个通用字段作为基表，例如 创建人，创建时间等，然后使用了触发器作为数据控制，即其他表的更改都会让这个基表更改
    2.User表
    没什么可说的
    3.Role表
    4.permission表
    同样，也不考虑主外从建，如果有需要，可以使用中间表，然后，关联的表在实体的体现为对象 如User 里面 字段 ：Role对象
  java
    1.使用mybatis 逆向生成的 mapper和dao
    2.dao 层，一律采用采用继承接口 CrudDao (Example是 查询条件的父接口)
    3.service 一律继承BaseService 写通用业务逻辑
    4.Controller 继承抽象类BaseController，写通用的控制方法，如BeanValidation和 返回处理参数，或防字符攻击编码
              或者继承DefaultController 作为所有控制器的父类 ，这样就可以不用在用@controller 声明控制器了
    
    5.其他的例如日志啊，缓存啊，一些其他的业务逻辑，能抽取的就抽取   ，最好使用aop，拦截器也行
    
    一些其他的：
    页面的话，
    1.分包规则，就分为 前台和后台吧，
    /a   后台目录
    /f   前台目录
    /s   超级管理员目录
    页面开发 主要用bootStrap 或EsayUI
    静态资源：
    webapp/statics  发布时候存到 niginx服务器上(还在测试。。)
    
    2.以后的静态常量 如 GetMapping value = "login.html"
	     写到src/mian/java com.cong.contants.AnRequest.java里面（请求地址管理类）
	     转发路径 如 return "ligin.jsp";
	     写到 src/mian/java com.cong.contants.Location.java （转发路径） 中
	     配置信息 从src/mian/java com.cong.GlobalConfig.java中读取
	     就是尽量在代码中出现常量。
	     
	3.完成某个功能的时候，最好先写出详细目的或者画图
	
	先做出基本框架，并且能够流畅无误的发布和部署，其余功能的的话，我在想如果按照这个思路去做的话，应该扩展性会很强，
	可以先从建一个博客网站开始 学习量不大 大概是两周。
	然后是，内容发布系统，Oa 工作流，再到搜索引擎（本地搜索）和各种开源技术了 如spring boot springdata
	然后是爬虫系统(java)，最后是分布式计算，算法不好，这里会很吃亏
	
	
备注：
          优取劣除，共同进步。2017-9-23 13.30
    
          
    
    