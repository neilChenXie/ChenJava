---
layout: post
title: spring手册
permalink: /:categories/spring_checklist
date: 2016-06-16 13:48:15 +0800
category: Spring
tags: [checklist]
---

### spring.xml/spring-\*.xml

`<beans>`

```xml
<beans	xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xmlns:context="http://www.springframework.org/schema/context"
		xsi:schemaLocation="http://www.springframework.org/schema/beans
							http://www.springframework.org/schema/beans/spring-beans.xsd
							http://www.springframework.org/schema/context
							http://www.springframework.org/schema/context/spring-context.xsd">
</beans>
```

*Explanation*

* first 2 lines `xmlns` `xmlns:xsi` **do not** need change.
* `xmlns:*` is for components which are used in the this xml, e.g. `<context>`.
    * Components means tags: `<aop>`,`<mvc>` and so on.
* `xsi:schemaLocation` for **all** components. **non-version xsd** is recommended.


### web.xml

`<web-app>`

```xml
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xmlns="http://java.sun.com/xml/ns/javaee"
		xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
		xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
		http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
		id="WebApp_ID" version="3.0">
</web-app>
```
