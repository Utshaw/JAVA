# Object Oriented Programming
## Four principles of OOP: 
1. Inheritance: relationship of classes, a class can have variables, functions of another class
2. Encapsulation: Hiding data from other classes via access modifier
3. Abstraction: Hiding details from outside the class
4. Polymorphism: Having a Java element which can be used in many forms. Example: functions with the same function name but different parameters

## Inheritance
- Allows to define a new class from an existing one and inherit it's attributes and methods
- **Is A Relationship:** subclass is a superclass

<img src="img/21.png">

<img src="img/22.png">

<img src="img/23.png">

<img src="img/24.png">

- Multiple Inheritance isn't allowed with classes in java but with interface it's allowed
- Two superclass with same method, child class inheriting from both of them: this will cause issue that's why not allowed this way
- With interface this is allowed as interface doesn't have function body

## Encapsulation
- Wrapping up of data under a single unit & prevents data from being accessed by the code outside


# Class 
- Blueprints of prototypes to create objects
# Objects 
- Actual instance of classes

## Access Modifier
- Are used to set the accessibility of classes, methods, class variables & other java elements
- Access Modifier can't be used for local variables (inside function, loops)
- Guideline: Restrict access as much as you can
```
Default: Only within the package
Private: Within the class Only
Protected: Within the package and all subclasses
Public: Visible everywhere
```
<img src="img/20.png">

