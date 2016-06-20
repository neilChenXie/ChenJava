---
layout: post
title: spring IOC-依赖注入
date: 2016-06-02 09:48:15 +0800
category: Spring
tags: [checklist]
---

## 索引

[中文](https://www.evernote.com/shard/s250/sh/026afcb5-0a7e-414f-9f22-54b59d6726a8/c323deea7b1ca9eda16e70a03f07ce38)


## 归类

[![归类]({{ site.baseurl }}/img/spring/DI.png)]({{ site.baseurl }}/img/spring/DI.png)

## bean tag

`<bean>`

[![bean tag]({{ site.baseurl }}/img/spring/bean.png)]({{ site.baseurl }}/img/spring/bean.png)


## Tips

自己的工厂，下面直接调工厂方法生成实例，传参为工厂方法的参数

```xml
<bean name="" class="" factory-method="">
  <constructor-arg />
</bean>
```