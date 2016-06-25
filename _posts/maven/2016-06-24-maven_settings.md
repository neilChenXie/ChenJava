---
layout: post
title: maven settings.xml
permalink: /:categories/maven_settings
date: 2016-06-24 19:46:15 +0800
category: Maven
tags: [setting]
---

### mirror

国内需要添加镜像

```xml
<mirrors>
	<mirror>  
		<id>CN</id>  
		<name>OSChina Central</name>
		<url>http://maven.oschina.net/content/groups/public/</url>  
		<mirrorOf>central</mirrorOf>  
	</mirror> 
</mirrors>
```

