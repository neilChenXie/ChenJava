---
layout: post
title: Shiro Session 外置 Redis
permalink: /:categories/shiro_redis_session
date: 2016-06-28 12:48:15 +0800
category: Shiro
tags: [shiro, redis, session]
---

### 项目目标

将Shiro的Session外置到Redis中

### 索引

#### 靠谱代码

[shiro-redis](https://github.com/neilChenXie/shiro-redis)

> 简单易懂

#### 补充阅读

[Shiro通过Redis管理会话实现集群](http://sgq0085.iteye.com/blog/2170405)

> * redisUtils类缺失，及对redis进行增删改查的类，项目立确实该分离，但这里影响理解
> * 版本不太一样，只适合阅读。[code](https://github.com/sgq0085/learn/tree/master/learn-shiro)

### 项目流程

阅读示例代码

> 找到[靠谱代码](https://github.com/neilChenXie/shiro-redis)（可运行，简单）Github，Baidu

加入Shiro源码，通过断点回追查看调用栈

> [Shiro SessionDAO-redis]({{ site.baseurl }}/shiro/shiro_redis_session_dao)

总结AbstractSessionDAO需要实现的几个方法的任务

> AbstractSessionDAO extends SessionDAO, Session是顶层Interface

项目文件

* RedisSessionDAO
* RedisUtils(可利用公用的，但Exception捕捉需要特定调整)
* SerializeUtils

编写项目代码

### 项目经验

Utils类

1. 应该抛出异常由调用者handle，而非返回null表示操作异常
2. optional： 可不记log，由调用者handle

> 调用者需要信息来进行"热备"等逻辑
