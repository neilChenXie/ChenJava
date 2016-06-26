---
layout: post
title: eclipse.ini
permalink: /:categories/eclipse_ini
date: 2016-06-26 11:30:15 +0800
category: Eclipse
tags: [eclipse, startup]
---

### JDK 相关

JDK(虚拟机)位置

```
-vm
/usr/local/jdk/bin/java
```

虚拟机启动参数

```
--vmargs
-Dosgi.requiredJavaVersion=1.7
-XstartOnFirstThread
-Dorg.eclipse.swt.internal.carbon.smallFonts
-XX:MaxPermSize=256m
-Xms256m
-Xmx1024m
```
