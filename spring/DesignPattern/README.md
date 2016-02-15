# Design Pattern

The note is based on `<大话设计模式>`

## Basic

* name, if-else, edge case
* OOD: easy 
	* maintain: change module
	* extend: add module
	* reuse: use by other
* encapsulation, inheritance, polymorphism: decouple
	* business layer encapsulate
	* decoupling: separate parameter and operation


## Simple Factory

create **object** based on **input**, return with **parent type** and **children override method**. (Virtual Function e.g.)

* **inheritance** separate operation
* **factory** create **parent** with **children method**

### When Change

change **related child** and **factory create method**

### UML

* unit(class): 1.name 2.param 3.operation 
* connect:
	* no tail, block head: inherit
	* no tail, line head: association(need to know other)
	* imaginary, line head: dependency
	* imaginary, block head: implement
	* black tail: compostition(strong own, # of instance)
	* white tail: aggregation(week own, array inside)


## Strategy

encapsulate change. when: Different time use different business strategy.

## Principle

### Single Responsibility Principle(SRP)

### The Open-Closed Principle(OCP)

open for **extension**, close for **modification**.

use abstract to handle change.

reject unmature abstract.

### Dependency Reversal

High level module not depend low level module, both depend on abstract

detail depend on abstract, abstract not depend on detail

Anti-Example: C library. Same business logic, different DB operation

## Abstract Factory

When multiple factories exist(different DB), need Abstract Interface.

### Reflection

Don't need `switch` anymore. 

### XML

Read file instead of **hard code**

Dependency Injection
