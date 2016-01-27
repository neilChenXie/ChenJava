# Abstract
This project will store **experience, template and other important things** to make my java development work more easilier.
And **Framework File** and **Procedures** are based on **Spring Framework**

## Contain
* [maven](https://github.com/neilChenXie/java_dev/tree/master/maven)
* [eclipse](https://github.com/neilChenXie/java_dev/tree/master/eclipse)
* [mybatis](https://github.com/neilChenXie/java_dev/tree/master/mybatis)

## Contents

* [Basic](#basic) 
	* `some important tips`
* [Framework Files](#framework_file) 
	* `how xml and other files work together`
* [Program Procedure]('#program_procedure') 
	* `how test and program run step-by-step`

<a id="basic"></a>

# Basic

## classpath & classpath\*

* classpath: path under `target/classes`

* classpath\*:

<a id="framework_file"></a>

# Framework File

There are templates under [TEMPLATE](https://github.com/neilChenXie/java_dev/tree/master/TEMPLATES) folder

## Core

Must contained inside a project. 

* [pom.xml]()
	* **maven** project information
	* `<dependencies>`
		jar package dependencies

* [spring.xml]()
	**core** config file for **spring**.
	* `<context:property-placeholder location="classpath:mybatis.properties" ignore-unresolvable="true"/>`
		load properties variables
		* **exception**
			* in **spring-mybatis.xml**: `<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">` inside cannot use properties
	* `<mvc:resources mapping="/images/**" location="/images/" />`
		auto **scan** **@Service** and execute **@Autowired**
	* `<import>`
		can import **spring-mybatis.xml** to integrate **mybatis**.

* [spring-mybatis.xml]()
	specify **elements** for **mybatis**
	* **data source** change when changed
	* `<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">` 
		where is **mapper.xml** files
	* `<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">` inside cannot use properties
		where is **DAO** package
* [spring-mvc.xml]()
	* `<context:component-scan base-package="com.controller" />`
		**scan** for **@Controller**
	* `<bean	class="org.springframework.web.servlet.view.InternalResourceViewResolver">` 
		specify **views** folder ,**.jsp** suffix.
	* `<mvc:resources mapping="/images/**" location="/images/" />` 
		specify **static** files
         
* [web.xml]()
	Load **all** xml files of this project
	* `<context-param>`
		* load **spring.xml** and **spring-mybatis.xml**
		* **critical**
			```xml
			<!--spring.xml-->
			<import resource="classpath:configs/spring-mybatis.xml" />
			<!--web.xml-->
			<param-value>classpath:configs/spring.xml, classpath:configs/spring-mybatis.xml</param-value>
			<!--DON'T INCLUD spring-mybatis.xml TWICE-->
			<!--Other files are the same-->
			```
	* `<filter>`
		* encoding filter
	* `<filter-mapping>`(filter router)
	* `<servlet>`
		* [spring-servlet].xml file
	* `<servlet-mapping>`(url router)
		* controller suffix

## Properties

Being imported by **xml** files to set **easily changed variables**

* [system.properties]()

* [jdbc.properties]()

* [codemsg.properties]()

<a id="program_procedure"></a>

# Program Procedure

* [JUnit Test](#junit_test)
* [Spring MVC](#spring_mvc)

<a id="junit_test"></a>

## JUnit Test

Work with **Junit** and **Spring-test** (need these 2 maven dependency jar)

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

<a id="spring_mvc"></a>

## Spring MVC

1. **web.xml** load spring.xml, spring-mybatis.xml and `<servlet>` load spring-servlet.xml

2. spring-servlet.xml **scan** `@RequestMapping` and **create** url routes

3. when request come, go through url path and end with one controller.
