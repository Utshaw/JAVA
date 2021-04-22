# static keyword
- Allows you to access Java elements without creating any object
- Are connected to the class ,rather than object

## static variable
- A class variable, not an object variable
- A single copy of variable is created and shared among all all objects at class level
- Initialized before any object is created
- Static and non-static methods can use it
## static method 
- can be accessed before any objects of its class are created & without any reference to the objects
- Can only directly call other static methods, static variable
- Can't refer to `this` or `super`  
## static block
- If any computation is needed to initialize static variables 
- Executed once when the class is loaded
- Blocks are executed in order

```
private static int staticVar;
static {

    staticVar = 1;
}
```