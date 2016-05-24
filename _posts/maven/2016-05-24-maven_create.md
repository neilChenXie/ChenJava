---
layout: post
title: maven check
date: 2016-05-24 13:46:15 +0800
category: Maven
tags: [setup]
---

## 创建工程

### Single java project

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
	-DarchetypeArtifactId=maven-archetype-quickstart \
	-DgroupId=[e.g. com.chen] -DartifactId=[e.g spring]
```

### Single Web Project

```bash
mvn archetype:generate \
    -DinteractiveMode=false \
	-DarchetypeArtifactId=maven-archetype-webapp \
	-DgroupId=[e.g. com.chen] -DartifactId=[e.g spring]
```

### Parent-Children project

Just run the **same** code **inside** parent project

> [cnblog](http://www.cnblogs.com/xdp-gacl/p/4242221.html)
