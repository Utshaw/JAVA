public class PizzaApp {

    public static void main(String[] args) {
        System.out.println("Available Sizes: ");
        for(PizzaSize pizzaSize: PizzaSize.values()) {
            System.out.println("- " + pizzaSize);
        }

        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("Name: "  + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: " + pizzaOrder.getPrice());

    }
}
