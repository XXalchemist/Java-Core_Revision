# Topics

| *Sr.no* | *Name* |
|---|---|
|1.| Datatypes|
|2.| Access Modifier|
|3.| Static, Final and Abstract|
|4.| If Else, Switch|
|5.| Loops|
|6.| Break. continue|
|7.| Methods|
|8.| Class|
|9.| OOPs Concept|
|10.| Interface|
|11.| Array |
|12.| Collections|

<br>

> To be added later on :- File Handling


## 1. Datatypes

Java have two datatypes :-
1. Primitive
2. Reference

*Object is parent class of all classes.*

_Syntax :-_

```Java
//datatype_name var_name = value;

int value = 5;
```
## 2. Access Modifiers

_Used for class, variables, methods._

|**Default**|**Private**|**Protected**|**Public**|
|-----------|-----------|-------------|----------|
|Visible to the package|Visible to the class only|Visible to package and all subclasses|Visible to the world|
|For a class, field, method etc| Class and Interface can't be private| Variables, methods and constructors which are declared protected in a superclass can be accessed only by the subclass| Fields, Methods, blocks declared inside public can be accesed from any class in java|

## 3. Static, Final and Abstract

- **Static** : Belonged to the class , runs firstly at the execution of class and access memory.
- **Final** : used to declare constant methods, variables.
- **Abstract** : used only by the extended class(child class).
- **Finally** : used in try-block to create 'always executing code'.