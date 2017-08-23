public enum ChineseMenu {

    SOUP_CHICKEN(20),
    SOUP_VEGETARIAN(30),

    NOODLES_CHICKEN(40),
    NOODLES_VEG(50),

    RICE_CHICKEN(60),
    RICE_VEG(70);

    private int value;

    ChineseMenu(int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
