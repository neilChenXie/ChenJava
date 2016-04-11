# maven-shade-plugin

jar package, all in one jar, support spring.

## Template

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
