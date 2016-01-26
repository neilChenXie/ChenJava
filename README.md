# Abstract
This project will store **experience, template and other important things** to make my java development work more easilier.
And **Framework File** and **Procedures** are based on **Spring Framework**

# Contain
* [maven](https://github.com/neilChenXie/java_dev/tree/master/maven)
* [eclipse](https://github.com/neilChenXie/java_dev/tree/master/eclipse)
* [mybatis](https://github.com/neilChenXie/java_dev/tree/master/mybatis)

# Framework File

There are templates under [TEMPLATE]() folder

## Core

Must contained inside a project. 

* [pom.xml]()
	* **maven** project information
	* jar package dependencies
* [spring.xml]()
	* **core** config file for **spring**.
	* auto **scan** **@Service** and execute **@Autowired**
	* can import **spring-mybatis.xml** to integrate **mybatis**.
* [spring-mybatis.xml]()
	specify **elements** for **mybatis**
	* data source
	* mapper.xml files
	* DAO package
* [spring-mvc.xml]()
	* **scan** for **@Controller** inside package
	* specify **views** folder ,**.jsp** suffix, and **statci** files.
* [web.xml]()
	* load **xml** files which are specified by `<context-param>` section
	* filter
		* encoding filter
	* filter-mapping(filter router)
	* servlet
		* [spring-mvc].xml file
	* servlet-mapping(url router)
		* controller suffix

## Properties

Being imported by **xml** files to set **easily changed variables**

* [system.properties]()

* [jdbc.properties]()

* [codemsg.properties]()

# Program Procedure

* [JUnit Test](#junit_test)
* [Spring MVC](#spring_mvc)
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

<a id="spring_mvc"></a>

## Spring MVC

1. **web.xml**


<a id="spring_junit"></a>

## Spring Annotation

###Autowired

###Service

###Override
