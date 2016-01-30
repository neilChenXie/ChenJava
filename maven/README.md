#Abstract

[Youtube Tutorial](https://www.youtube.com/playlist?list=PL92E89440B7BFD0F6)

# Index

* [Create Project](#create_project)
* [Basic](#basic)
* [Dependency](#dependency)

<a id="create_project"></a>

# Create Project

```bash
mvn archetype:generate \
	-DarchetypeArtifactId=maven-archetype-webapp \
	-DgroupId=[e.g. com.chen] -DartifactId=[e.g spring] 
```

<a id="basic"></a>

# Basic 

```bash
#####Clean####
#Clean war package
mvn clean

#####Eclipse#####
#Create Eclipse specific file Before importing
mvn eclipse:eclipse

#Clean eclipse related files
mvn eclipse:clean

#####After Write(Not Eclipse related Independent)#####
#Compile
mvn compile

#Test
mvn test

#Create war package
mvn package
```

<a id="dependency"></a>

# Dependency

* Load Order

	the Version maybe affected by loading order, cause ClassNotFound error.
