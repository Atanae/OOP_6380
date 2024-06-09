package less1.practice.impl;

public enum Drinks {
    COFFEE("Кофе"), TEA("Чай"), HOT_CHOCOLATE("Горячий шоколад");


    private final String drink;
    Drinks(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
