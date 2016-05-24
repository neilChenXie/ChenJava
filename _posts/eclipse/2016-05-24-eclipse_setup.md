---
layout: post
title: eclipse 配置
date: 2016-05-24 15:39:15 +0800
category: Eclipse
tags: [setup]
---

## workspace

Workspace can be separate with project files, use separate folder to manage,
Save **configured** and **no imported project** workspace folder as **template**

### Setting

Auto-complete

```
Preference->Java->Editor->Content Assist
trigger:
._qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM
```

File Encoding

```
Preference->General->Workspace/Content Types
set to UTF-8
```

Maven

```
Preference->Maven->User Settings(apache-maven-*.*.*/conf/settings.xml)
settings.xml: <localRepotory>[Location for store *.jar]</localRepotory>
```

> [Crucial Setting](https://github.com/neilChenXie/java_dev/blob/master/eclipse/MavenProject.md)

JDK

```
Preference->Java->User Installed JREs(/jdk*.*.*_*)
```

Package Explore

```
window->show view->other->package explore
```

Code Style

```
window->preference->Java->Code style->code template->comment->Types/Methods
Types:
/**
* @describe
*
* @author ${user}
* @date ${date}
*/
Method:
/**
* @describe
*
* @author ${user}
* @date ${date}
* @param
* @return
*/
```
