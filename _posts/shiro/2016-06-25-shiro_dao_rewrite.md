---
layout: post
title: Shiro redisSessionDAO
permalink: /:categories/shiro_redis_session_dao
date: 2016-06-25 12:48:15 +0800
category: Redis
tags: [shiro, redis, session, dao]
---

### 源码学习

#### 程序运行入口和单步调试

运行入口

1. Spirng->Shiro.spring.ShiroFilter转化的WebSubject
2. subject.login() 第一次登录

Servlet调用栈

> sping到shiro通过`doFilter`接口

[![]({{ site.baseurl }}/img/shiro/servlet.png)]({{ site.baseurl }}/img/shiro/servlet.png)

Login调用栈

> 先验证，在save(subject)开始写入sessionDAO

[![]({{ site.baseurl }}/img/shiro/login.png)]({{ site.baseurl }}/img/shiro/login.png)

#### 与DAO相关类

[![shiro_class]({{ site.baseurl }}/img/shiro/shiro-redis.png)]({{ site.baseurl }}/img/shiro/shiro-redis.png)

#### 多层继承(抽象)工作方式

原则

1. 模块间基于Interface

> sessionManager, sessionDAO, Cookie, securityManager, Realm, Authenticator, Authorizer

2. 父模块->Interface->Instance->method based on parents' method->其他子模块

#### 多工程工作方式

> shiro-web 与 shiro-core 协同

入口为shiro-web, 在模块调用时进入shiro-core, 某功能完成后一层层返回, 下一个功能...
