---
layout: post
title: pom 模板
date: 2016-06-12 13:45:15 +0800
category: Maven
tags: [template]
---

## 创建时修改

```xml
<properties>
    <maven.build.timestamp.format>yyyyMMddHHmmss</maven.build.timestamp.format>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
</properties>

<build>
    <finalName>${project.artifactId}</finalName>
    <!--project path-->
    <sourceDirectory>src/main/java</sourceDirectory>
    <testSourceDirectory>src/test/java</testSourceDirectory>
    <outputDirectory>target/classes</outputDirectory>
    <testOutputDirectory>target/test-classes</testOutputDirectory>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
        </resource>
    </resources>
    <!--plugins-->
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <!--TODO:check-->
            <version>3.5</version>
            <configuration>
                <!-- TODO:yours Java version -->
                <source>1.8</source>
                <!-- TODO:yours Java version -->
                <target>1.8</target>
                <encoding>UTF-8</encoding>
            </configuration>
        </plugin>
    </plugins>
</build>
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <!-- TODO:check version -->
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
