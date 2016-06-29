---
layout: post
title: Shiro Combine with Spring
permalink: /:categories/shiro_spring_combine
date: 2016-06-19 09:48:15 +0800
category: Shiro
tags: [checklist]
---

[reference](http://blog.csdn.net/lyh_974056553/article/details/17229667)

## web.xml

> 将shiro加入Filter

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

## spring-shiro.xml

```xml
<bean id="securityManager" class="org.apache.shiro.web.mgt.DefaultWebSecurityManager">  
    <!--单个realm使用realm,如果有多个realm，使用realms属性代替-->  
    <property name="realm" ref="shiroRealm" />  
    <!-- <property name="cacheManager" ref="shiroEhcacheManager" /> -->  
</bean>  

<!--realm配置，realm是shiro的桥梁，它主要是用来判断subject是否可以登录及权限等-->  
<bean id="shiroRealm" class="com.shiro.realm.ShiroRealm">  
    <property name="userService" ref="userService" />  
</bean>  

<bean id="userService" class="com.shiro.service.UserService" />  

<!--shiro过滤器配置，bean的id值须与web中的filter-name的值相同-->  
<bean id="shiroFilter" class="org.apache.shiro.spring.web.ShiroFilterFactoryBean">  
    <property name="securityManager" ref="securityManager" />  
    <!-- 没有权限或者失败后跳转的页面 -->  
    <property name="loginUrl" value="/index.jsp" />  
    <property name="successUrl" value="/loginSuccess.jsp" />  
    <property name="unauthorizedUrl" value="" />  
    <property name="filterChainDefinitions">  
        <value>  
            /logout.do = logout  
            /user/** = authc  
            /admin/** = authc,roles[admin]  
        </value>  
    </property>  
</bean>  

<!-- 用户授权/认证信息Cache, 采用EhCache 缓存 -->  
<!--   
<bean id="shiroEhcacheManager" class="org.apache.shiro.cache.ehcache.EhCacheManager">  
    <property name="cacheManagerConfigFile" value="/WEB-INF/ehcache-shiro.xml" />  
</bean>   
-->  

<!-- 保证实现了Shiro内部lifecycle函数的bean执行 -->    
<bean id="lifecycleBeanPostProcessor" class="org.apache.shiro.spring.LifecycleBeanPostProcessor"/>    

<!-- AOP式方法级权限检查  -->  
<bean class="org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator" depends-on="lifecycleBeanPostProcessor">    
    <property name="proxyTargetClass" value="true" />    
</bean>    

<bean class="org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor">    
    <property name="securityManager" ref="securityManager"/>    
</bean>
```
