---
layout: post
title: Shiro 入门
permalink: /:categories/shiro_entry
date: 2016-06-18 00:05:15 +0800
category: Shiro
tags: [entry]
---

### 索引

* [跟我学Shiro](http://jinnianshilongnian.iteye.com/blog/2018398)
* [跟我学Shiro-源码](https://github.com/neilChenXie/shiro-example)

### 摘要

![shiro structure]({{ site.baseurl }}/img/shiro/shiro_structure.png)

### 理解

第一章

> 各大模块功能

1. 入口都是各个Subject
2. 初始化注入（Spring）的时候，将各个模块插入Security Manager.
3. Realm用于获取数据库（或其他持久化存储）,并验证登录.和赋权
4. SessionManager负责session逻辑，SessionDAO负责Session存储
5. CacheManager用于Cache管理（性能提升时需要）

第二章

> securityManager, Authenticator, AuthenticationStrategy, Realm之间的关系

![shiro structure]({{ site.baseurl }}/img/shiro/chapter2.png)

第三章

> 基于角色，基于资源的权限分配及实践

![shiro structure]({{ site.baseurl }}/img/shiro/chapter3.png)

第七章

url模式使用Ant风格模式

> Ant路径通配符支持?、*、**，注意通配符匹配不包括目录分隔符“/”：

* ?：匹配一个字符，如”/admin?”将匹配/admin1，但不匹配/admin或/admin/2；
* \*：匹配零个或多个字符串，如/admin*将匹配/admin、/admin123，但不匹配/admin/1；
* \*\*：匹配路径中的零个或多个路径，如/admin/**将匹配/admin/a或/admin/a/b

第十章


第十章会话管理

> 会话(session)管理
