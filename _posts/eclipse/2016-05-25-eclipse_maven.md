---
layout: post
title: Eclipse Maven Project经验
date: 2016-05-25 09:39:15 +0800
category: Eclipse
tags: [setup]
---

以下是导入Maven Project时候遇到的Bug，建议不要用Maven Project导入工程，用 **existing
project** 即可。

Import existing project, **don't** import as maven project

## Project Properties

* `<build>` need specify *Java*  Version

```
<build>
	<finalName>realmvc</finalName>
	<!--eclipse needed-->
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.0</version>
			<configuration>
				<source>1.8</source> <!-- yours Java version -->
				<target>1.8</target> <!-- yours Java version -->
			</configuration>
		</plugin>
	</plugins>
</build>
```

## Check & Revise

Java Build Path

```
JRE System Library
1.5 -> 1.8
```

Project Facets

```
Go to .settings/
org.eclipse.jdt.core.prefs:
	1.5 -> 1.8 (Java version using)
org.eclipse.wst.common.project.facet.core.xml
	jst.web (Dynamic Web Module): 2.3 -> 3.0
	java: 1.5 -> 1.8 (Java version using)
restart eclipse
```
