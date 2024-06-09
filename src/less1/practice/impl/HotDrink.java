package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    protected float volume;
    private String drink;
    private boolean isMilk;
    protected int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isMilk = false;
        this.temperature = 40;
        this.volume = 200;
        this.drink = Drinks.TEA.getDrink();
    }
    public HotDrink(String name, double price, LocalDate releaseDate,
                    boolean isMilk, int temperature, float volume, String drink) {
        super(name, price, releaseDate);
        this.isMilk = false;
        this.temperature = temperature;
        this.volume = volume;
        this.drink = drink;
    }

    public float getVolume() {
        return volume;
    }

    public String getDrink() {
        return drink;
    }

    public boolean isMilk() {
        return isMilk;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "volume=" + volume +
                ", drink='" + drink + '\'' +
                ", isMilk=" + isMilk +
                ", temperature=" + temperature +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }

}
