## 不属于任何模块，只是代码生成器工具内容
进入do-mybatis-generator目录下，运行下面的命令即可，配置文件中的表名改为自己需要生产的表名
【目前配置是去除注释，覆盖生成的模式，多次生成不影响原代码】
####*.mysql Generator 命令:
java -jar jar/mybatis-generator-core-1.3.7.jar -configfile mysqlConfig.xml -overwrite
####*.oracle Generator命令:
java -jar jar/mybatis-generator-core-1.3.7.jar -configfile oracleConfig.xml -overwrite
####*.postgres Generator命令:
java -jar jar/mybatis-generator-core-1.3.7.jar -configfile postgresConfig.xml -overwrite
