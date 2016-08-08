# Shiro

## Reference

1. [跟我学Shiro](http://jinnianshilongnian.iteye.com/blog/2018398)

## Spring Combine

### web.xml

```xml
<!-- The filter-name matches name of a 'shiroFilter' bean inside applicationContext.xml -->
<filter>
    <filter-name>shiroFilter</filter-name>
    <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
    <init-param>
        <param-name>targetFilterLifecycle</param-name>
        <param-value>true</param-value>
    </init-param>
</filter>

<!-- Make sure any request you want accessible to Shiro is filtered. /* catches all -->
<!-- requests.  Usually this filter mapping is defined first (before all others) to -->
<!-- ensure that Shiro works in subsequent filters in the filter chain:             -->
<filter-mapping>
    <filter-name>shiroFilter</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```

\* DelegatingFilterProxy will invoke the bean based on **name**.
[Reference](http://stackoverflow.com/questions/6725234/whats-the-point-of-spring-mvcs-delegatingfilterproxy)

### spring-shiro.xml
