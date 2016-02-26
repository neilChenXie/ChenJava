# spring.xml, spring-\*.xml

All the files are configure **bean**, which will be created during spring **bootup**.

## Start

```xml
<?xml version="1.0" encoding="UTF-8"?>
```
## Structure

`<beans>` include `<bean>`


## components

###`<beans>`

1. Example

```xml
<beans	xmlns="http://www.springframework.org/schema/beans"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xmlns:context="http://www.springframework.org/schema/context"
		xsi:schemaLocation="http://www.springframework.org/schema/beans
							http://www.springframework.org/schema/beans/spring-beans.xsd
							http://www.springframework.org/schema/context
							http://www.springframework.org/schema/context/spring-context.xsd">
```

2. Explanation

* first 2 lines `xmlns` `xmlns:xsi` **do not** need change.
* `xmlns:*` is for components which are used in the this xml, e.g. `<context>`.
    * Components means tags: `<aop>`,`<mvc>` and so on.
* `xsi:schemaLocation` for **all** components. **non-version xsd** is recommended.

### `<bean>`
