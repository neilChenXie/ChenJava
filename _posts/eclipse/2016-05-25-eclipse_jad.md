---
layout: post
title: Eclipse Jad 反编译器安装
date: 2016-05-25 14:30:15 +0800
category: Eclipse
tags: [plugins]
---

一、下载jadClipse

> [地址](https://sourceforge.net/projects/jadclipse/)

二、将net.sf.jadclipse_3.3.0.jar拷贝到eclipse的plugins目录下

三、重启eclipse

四、下载jad

> [地址](http://varaneckas.com/jad/)

> BUG: Linux 应下载 **statically linked** 版，其他版会有库链接问题

五、eclipse中设置jadClipse使用jad

> window->preferences,搜jadClipse,第一项设置jad可执行位置，第二项是临时文件位置

六、关联文件

> window->preferences，搜file association， **\*.class** 和 **\*.class without
source** 都设置默认为jadClipse打开
