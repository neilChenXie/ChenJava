##Before

###First Time

1. put generator/ in a place, which will be static for future use.

2. change PATH of `mysql-connector-java-*.*.*-(bin).jar`

	```xml
	<classPathEntry location="/home/chen/Documents/generator/mysql-connector-java-5.1.38-bin.jar" /> 
	```
###Every Time(include first time)

1. add & modify

	```xml
	<table tableName="onlykey" domainObjectName="OnlyKey" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false" />
	```

##Run

```
java -jar mybatis-generator-core-1.3.2.jar -configfile generator.xml -overwrite
```
