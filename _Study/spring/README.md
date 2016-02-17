#Spring

## Abstract

This will include much **concept-related** experience, and it\'s for **second-stage** study

## Read List

1. [Design Pattern](http://pan.baidu.com/s/1mhyETk8): Understand why xml configuration
	1. Factory, Factory Method, Abstract Factory, Reflection Combination
	2. Dependency Reversal
	3. Dependency Injection
2. [POJO](http://blog.sina.com.cn/s/blog_a29ae6fe01012exn.html)
3. [Spring Tutorial](http://www.tutorialspoint.com/spring/)

## Logic

Dependency Injecting => Injecting Inner Beans => Injecting Collection => 

XML Configuration => Annotation Based Configuration

Event Handling => Customer Event

## Unit

Based on `Spring Tutorial`

### IoC Container

* IoC Container uses **Dependency Injection**(DI) to manage the **components** that make up an application.

### Bean

* **Java objects** with **Spring management attributes**.
* `property` tag is for **GetSet** method.

### Scope

* How to manage Beans, such as **singleton**, **prototype** and so on.

### Bean Life Cycle

* `init-method` and `destroy-method` attributes for after & before init & destroy
* `default-init-method` and `default-init-method` for **default** multiple the same name.

### BeanPostProcessor

* Spring execute Before/After Init.

### Bean Definition Inheritance

* inherit spring attributes, such as constructor argv, property values.
* `parent` attr.
* can create **Bean Defination Template**
	* `abstract="true"`

### Dependency Injection

* **input argv** instead of `new`
* Where `@Autowired` works

```java
/*original*/
public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor() {
      spellChecker = new SpellChecker();
   }
}

/*inversion of control*/
public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
}
```

### Injecting Inner Beans

* `<bean>` inside `<property>`

### Injecting Collections

* `<list>`, `<set>`, `<map>`, and `<props>` inside `<property>`

### Autowire

### Annotation Based

* annotation injection performed **before** XML injection
* `<context:annotation-config />`
* `@Required`, `@Autowired`, `@Qualifier` and `JSR-250 Annotations`

### Event Handling

* ApplicationContext publish certain types of **events** when loading beans.

### Customer Events

### JDBC Framework

* **Data Source** is **injected** into **DAO**(Data Access Object) by dependency injection
* CRUD(Create, Read, Update, Delete)

## Bug & Experience

### @Autowired & @Service

**key words**: Singleton, GetSet.
