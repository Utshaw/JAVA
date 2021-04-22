public enum PizzaSize {
    SMALL("Small Size"), MEDIUM("Medium Size"), LARGE("Large Size");
    private String pizzaSizeText;

    PizzaSize(String pizzaSizeText) {
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
