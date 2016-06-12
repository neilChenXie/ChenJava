---
layout: post
title: Spring Maven Pom
date: 2016-06-02 13:48:15 +0800
category: Spring
tags: [maven, checklist]
---

## JAR project

### pom.xml

```xml
<properties>
    <spring.version>4.2.6.RELEASE</spring.version>
</properties>

<!-- also add spring-core, spring-expression, spring-aop, spring-beans -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>${spring.version}</version>
</dependency>
```
