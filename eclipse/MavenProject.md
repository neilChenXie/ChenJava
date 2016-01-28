# Import

Import existing maven project

# Project Properties

## [**pom.xml**](https://github.com/neilChenXie/java_dev/blob/master/TEMPLATES/pom.xml)

* `<build>` need specify *Java* and *Dynamic Web Application* Version
	
	```
	<build>
		<finalName>realmvc</finalName>

		<!--eclipse needed-->
		<plugins>

			<plugin>
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

* Java Build Path

	```
	JRE System Library
	1.5 -> 1.8
	```

* Project Facets

	```
	Go to .settings/
	org.eclipse.jdt.core.prefs: 
		1.5 -> 1.8 (Java version using)
	org.eclipse.wst.common.project.facet.core.xml
		jst.web (Dynamic Web Module): 2.3 -> 3.0
		java: 1.5 -> 1.8 (Java version using)
	restart eclipse
	```
