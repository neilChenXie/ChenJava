# Start
This project will store **experience, template and other important things** to make my java development work more easilier.
And the procedures are based on **Spring Framework**

# Contain
* [maven](https://github.com/neilChenXie/java_dev/tree/master/maven)
* [eclipse](https://github.com/neilChenXie/java_dev/tree/master/eclipse)
* [spring/spring-mvc]()
* [mybatis](https://github.com/neilChenXie/java_dev/tree/master/mybatis)

# Program Procedure

* [JUnit Test](#junit_test)
* [Spring Annotation](#spring_annotation)

<a id="junit_test"></a>

## JUnit Test

1. Load xml Files and Create Beans(2 ways)

	1. spring.xml include others(spring-mybatis.xml)
		
		```xml
		<!--import resource-->
		<import resource="classpath:configs/spring-mybatis.xml" />
		```

		```java
		@RunWith(SpringJUnit4ClassRunner.class)
		@ContextConfiguration(locations = { "classpath:configs/spring.xml"})
		```

	2. Junit and Spring-test
		
		```xml
		<!--import resource-->
		<!--<import resource="classpath:configs/spring-mybatis.xml" />-->
		```
		```java
		@RunWith(SpringJUnit4ClassRunner.class)
		@ContextConfiguration(locations = { "classpath:configs/spring.xml", "classpath:configs/spring-mybatis.xml"})
		```

2. spring-mybatis specify where is DAO package and where is mapping/[mapper].xml

3. getBean("[name in @Service()]") which is set inside **spring.xml** to **auto scan**

4. test **method** in interface implementation

<a id="spring_junit"></a>

## Spring Annotation

###Autowired

###Service

###Override
