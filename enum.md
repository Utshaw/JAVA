# Enum
- A special data type which is a collection of constants
- all enum constants are public final static by default
- it can have variable, function, constructor
- enum constructor are private
- no need for new keyword

## Built-in functions
- `.values()` returns array of all enum constants

PizzaSize
```
public enum PizzaSize {
    SMALL, MEDIUM, LARGE;
}
```
Pizza
```
public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }
}

```
