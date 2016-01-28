# Start

* [Setting](#setting)
* **[Deploy](#deploy)**
* [Plugin](#plugin)
* [Odd Problem](#odd_problem)


<a id="setting"></a>

# Setting

* Autocomplete
	
	```
	Preference->Java->Editor->Content Assist
	```

* File Encoding

	```
	Preference->General->Workspace/Content Types
	```

* Maven

	```
	Preference->Maven->User Settings(apache-maven-*.*.*/conf/settings.xml)
	settings.xml: <localRepotory>[Location for store *.jar]</localRepotory> 
	```

	[Crucial Setting](https://github.com/neilChenXie/java_dev/blob/master/eclipse/MavenProject.md)

* Package Explore

<a id="deploy"></a>

#Deploy

* When deploy to **Tomcat**, need set **Deployment Assembly**.

	(project) properties->Deployment Assembly->Add->Java Build Path Entries, add all to the project

<a id="plugin"></a>

# Plugin

* Rinzo(xml)/vrapper(vim)

<a id="odd_problem"></a>

#Odd Problem

* Classpath entry org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER will not be exported
	You can right click on the warning, choose quickfix and choose one of the following:
		1. Mark the associated raw classpath entry as a publish/export dependency.
		2. Exclude the associated raw classpath entry from the set of potential publish/export dependencies.
	As you will not have eclipse publishing/exporting the project it is safe to exclude it. But either way it makes no difference
	Step by step screenshots:
	[link](http://publib.boulder.ibm.com/infocenter/radhelp/v8/index.jsp?topic=/com.ibm.javaee.doc/topics/tlooseclasspath.html)
