
>### 注册自定义枚举TypeHandler
>>mybatis默认枚举TypeHandler只能存名字或序号，不能对值做存取，所以要实现对值存取需要自己写TypeHandler。
>>* 继承BaseTypeHandler\<E\>并实现
>>* 在实现类或子类（本例用的子类）上增加注解：MappedJdbcTypes和MappedTypes；或者在xml中使用TypeHandler属性指定
>>* 配置文件中增加mybatis.type-handlers-package路径

>### 由数据库表逆向生成pojo、xml、mapper
>>* 在build中添加plugin：mybatis-generator-maven-plugin
>>* 创建generatorConfig.xml，并配置数据库驱动、连接、路径、映射等
>>* 在Run-->Edit Configurations添加Maven命令：mybatis-generator:generate -e
>>* run 上步添加的命令即可