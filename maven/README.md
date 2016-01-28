# Index
* [Create Project](#create_project)
* [Basic](#basic)

<a id="create_project"></a>
<a id="dependency"></a>

# Create Project

```bash
mvn archetype:generate \
	-DarchetypeArtifactId=maven-archetype-webapp \
	-DgroupId=[e.g. com.chen] -DartifactId=[e.g spring] 
```

<a id="basic"></a>

# Basic 

```bash
#Clean war package
mvn clean

#Download dependencies and build for eclipse
mvn eclipse:eclipse

#Clean eclipse related files
mvn eclipse:clean

#Create war package
mvn package
```

<a id="dependency"></a>

# Dependency

* Load Order

	the Version maybe affected by loading order, cause ClassNotFound error.
