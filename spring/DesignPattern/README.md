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
* Object & Class
	Object is instance of Class

* UML
	* unit(class): 1.name 2.param 3.operation 
	* connect:
		* no tail, block head: inherit
		* no tail, line head: association(need to know other)
		* imaginary, line head: dependency
		* imaginary, block head: implement
		* black tail: compostition(strong own, # of instance) * white tail: aggregation(week own, array inside) 

##Logic

### Factory Related Pattern

Simple Factory 
=> (Dependency Reversal, Factory Interface, client decide)
Factory Method 
=> (When: Multiple product interface)
Abstract Factroy
=> (Problem: modify too many when add)
Simple Factory with multiple method
=> (Reflection)
No `switch` and `case`
=> (How: Dependency Injection, XML configue)
No **hard code**

**Conclusion**: simple factory with reflection.

##Unit

###Simple Factory

```java
class Sf {
	public Parent create(input) {
		switch(input) {
			case "kid";
				Parent p = new child();
		}
		return p;
	}
}
```

###Strategy

```java
class Context {
	private Parent p;
	
	public Context(input) {
		switch(input) {
			case "kid":
				this.p = new child();
		}	
	}

	public int result() {
		return p.getResult();	
	}
}
```

###Factory Method

compare to **simple factory**:
New: Factory Interface
	* Obey **open-close** when extend.
	* Client **decide** which Factory to use

###Abstract Factory

multiple factories with **factory method**

###Better with Reflection

**Reduce** Abstract Factory back to Simple Factory with **Reflection** with **Dependency Reflection**.
No more `switch` and `case`
with **XML** no more **hard code**
