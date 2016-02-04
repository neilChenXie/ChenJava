# Mybatis

This include some **understand** of Mybatis, related **Tools** and **xml file template**

## Content

* [Relationship](#relationship)
 
* [Bug/Exp](#bug)

* [Reference](#reference)


<a id="relationship"></a>

## Relationship

### Overview

**mapping/\*.xml, dao, service, serviceImpI**

* **Interface**
	
	* dao

	* service

* **Implement**

	* mapping/\*.xml is the implement of dao, be `@Autowired` by serviceImpI

	* serviceImpI is the implement of service, be `@Autowired` by Test, Controller or something else.

### mapping/\*.xml

#### Operation Tag

* select

	* **resultType**: use Java Object(hashmap) or Self-created Object(), need **alias** in **SQL**

	* **resultMap**: use `<resultMap>` to transfer **column name** to **Dao Object member**

* insert

* update

* delete

#### `<resultMap>`

* Attributes

	* `<extends>`

* Tag inside
	
	* `<association>`
		
		Same as `<collection>`, for return value is a Object.

	* `<collection>`

		* select multiple times(**Not recommanded**)

			property="[nameInDao]" column="[InputColumn]" javaType="[list]" select="[selectTagName]"
		
		* join result

			property="[nameInDao]" javaType="[list]" ofType="[elementType]"

			* `<id>`
				
				property="[nameInModel]" column="[aliasInPreviousResult]"

			* `<result>`


<a id="bug"></a>

## Bug/Exp

* mapping/\*.xml should be put under **src/main/resource** instead of **src/main/java**.


<a id="reference"></a>

## Reference

This include related tools and files.

### Related Tool

	* [generator](https://github.com/neilChenXie/java_dev/tree/master/mybatis/generator)

		`used for generating dao, model and mapping`

### Related XML file

	* [spring-mybatis.xml](https://github.com/neilChenXie/java_dev/blob/master/TEMPLATES/resources/configs/spring-mybatis.xml)
