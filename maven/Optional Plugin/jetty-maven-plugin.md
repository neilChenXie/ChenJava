#jetty-maven-plugin

## To Use

```bash
mvn jetty:run
```

## pom.xml position

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
