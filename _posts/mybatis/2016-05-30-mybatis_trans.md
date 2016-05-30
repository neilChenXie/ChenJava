---
layout: post
title: mybatis 转义
date: 2016-05-30 13:48:15 +0800
category: Mybatis
tags: [checklist]
---

1. 在xml的sql语句中，不能直接用大于号、小于号要用转义字符

如果用小于号会报错误如下：

org.apache.ibatis.builder.BuilderException: Error creating document instance.  Cause: org.xml.sax.SAXParseException: The content of elements must consist of well-formed character data or markup.

| special | original | meaning |
| ------- | -------- | ------- |
| &lt; | < | less than |
| &gt; | > | bigger than |
| &amp; | & | and |
| &apos; | ' |  |
| &quot; | " |  ||

2. 使用
<![CDATA[ ]]>标记的sql语句中的<where> <if>等标签不会被解析
