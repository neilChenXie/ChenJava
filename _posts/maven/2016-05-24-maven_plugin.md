---
layout: post
title: maven plug-ins
date: 2016-05-24 13:46:15 +0800
category: Maven
tags: [template]
---

maven有各种查件完成需要的工作

## 一个可执行的Jar包

> maven-shade-plugin

pom.xml

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>2.4.3</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                    <configuration>
                        <!--TODO: package name-->
                        <finalName>monitor</finalName>
                        <shadedArtifactAttached>true</shadedArtifactAttached>
                        <!--TODO: string appended to package name-->
                        <shadedClassifierName>jar-with-dependencies</shadedClassifierName>
                        <transformers>
                            <!--Executable jar-->
                            <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                <!--TODO: main class position-->
                                <mainClass>com.sekorm.monitor.main.Monitor</mainClass>
                            </transformer>
                            <!--Spring support-->
                            <transformer implementation="org.apache.maven.plugins.shade.resource.AppendingTransformer">
                                <resource>META-INF/spring.handlers</resource>
                            </transformer>
                            <transformer implementation="org.apache.maven.plugins.shade.resource.AppendingTransformer">
                                <resource>META-INF/spring.schemas</resource>
                            </transformer>
                            <transformer implementation="org.apache.maven.plugins.shade.resource.AppendingTransformer">
                                <resource>META-INF/spring.tooling</resource>
                            </transformer>
                        </transformers>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

run command

```bash
mvn package
```

## jetty插件

> jetty-maven-plugin

pom.xml

```xml
<build>
    <!--ohter than plugin-->
    <plugins>
        <!--other plugin-->
        <plugin>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>jetty-maven-plugin</artifactId>
            <!--TODO: check-->
            <version>9.3.7.v20160115</version>
            <configuration>
                <httpConnector>
                    <!--TODO: set url & port-->
                    <!--host>localhost</host-->
                    <port>9999</port>
                </httpConnector>
            </plugin>
        </plugins>
    </build>
```

run command

```bash
mvn jetty:run
```
