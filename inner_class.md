# Inner Class
- Class defined within another class
- Acceses to the outer class member even the private members
- Some classes are dependent on only one class, or used by one class, or we like to restrict access of the used class.
## Another class in the same file
- can only be package-private
```
public class PizzaApp {
    ...
}
class Pizza {
    ...
}
```
## Inner class
- There should be a live instance of outer class
- treats the inner class as a regular member of a class
- can access to outer class members including private members
```
public class Pizza2 {

    private PizzaSlice pizzaSlice;
    public Pizza2() {
        pizzaSlice = new PizzaSlice();
    }

    class PizzaSlice {

    }
}

```
## Anonymous class
- local definition of a class
- has no name
- can be instantiated only once
```
Pizza pizzaOrder2 = new Pizza("Margharita", PizzaSize.LARGE)  {
            @Override
            public String getName() {
                return super.getName() + "-" + super.    getPizzaSize();
            }
};
```
## static nested class
- inner class marked with static modifier
- can't access non static member of outer class
- 
## method local inner class
- class defined in a method
- acts as a local variable
- can be abstract or final