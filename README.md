# Abstract
This project will store **experience, template and other important things** to make my java development work more easilier.
And **Framework File** and **Procedures** are based on **Spring Framework**

##Study Process(Serial)

1. [Video Tutorial](http://pan.baidu.com/s/1bnVKg1p): Create first springmvc application
2. [Spring&MVC](https://github.com/neilChenXie/java_dev/tree/master/_Study/spring%26mvc): Tutorial&Experience

# Contents

* [Basic](#basic) 
* [Framework Files](#framework_file) 
* [Procedure]('#program_procedure') 
* [eclipse special](https://github.com/neilChenXie/java_dev/tree/master/eclipse#deploy)


<a id="basic"></a>

# Basic

## How to start a project

1. **maven**(create project)
2. **eclipse** import(change some necessary changes)
3. create **Mybatis** Dao, Mapping, Model and Import
4. add **spring.xml**, **spring-mybatis.xml**, **\*.properties** files
5. write **Service**
6. test Service with **JUnit**
7. import **spring-servlet.xml**, revise it and **web.xml**
8. test with Jetty(Tomcat)

## Relationship

* **maven** is used to create project(pom.xml + folders), manage dependencies and packing to publish.

* **eclipse** used to create package, class, autocomplete, debug. (I am using eclim(vim+eclipse) to edit)

* **mybatis** is used for Model

* **spring** is used for **integrating** Controller, Views and Mybatis.



<a id="framework_file"></a>

# Framework File

## Core

Must contained inside a project. 

* pom.xml

	* **maven** project information

	* `<dependencies>`

		jar package dependencies

* spring.xml

	**core** config file for **spring**.

	* `<context:property-placeholder />`

		load properties variables

		* **exception:**

			* in **spring-mybatis.xml**: `<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">` inside cannot use properties

	* `<context:component-scan />`
	
		auto **scan** **@Service** and execute **@Autowired**.

	* `<import>`

		can import **spring-mybatis.xml** to integrate **mybatis**.

* spring-mybatis.xml

	specify **elements** for **mybatis**

	* **data source** change when changed

	* `<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">` 

		where is **mapper.xml** files
	* `<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">` inside cannot use properties

		where is **DAO** package

* spring-mvc.xml

	* `<context:component-scan />`

		**scan** for **@Controller**

	* `<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">` 

		specify **views** folder ,**.jsp** suffix.

	* `<mvc:resources />` 

		specify **static** files
         
* web.xml

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

# Procedure

* [Create Project](#create)
* [JUnit Test](#junit_test)
* [Spring MVC](#spring_mvc)

<a id="create"></a>

## Create Project

1. (Maven)maven command: detail in maven project

2. (Maven/Eclipse)modify pom.xml to fit eclipse: /eclipse/MavenProject.md pom.xml section

3. (Eclipse)Import project to eclipse, check /eclipse/MavenProject.md check section

4. (Mybatis) use generator create **dao**, **mapping** and **model**(MVC:Model)

5. (Eclipse) import **dao**, **mapping** and **model**

6. (Eclipse) create spring.xml, spring-mybatis.xml **based on** /TEMPLATE

7. (Eclipse/Editor) write junit and spring-test program test **DB connection**

8. (Eclipse) create spring-servlet.xml and write web.xml

9. (Eclipse/Editor) write Controllers and Views

10. (Eclipse) Deploy to test **URL connection** 

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
