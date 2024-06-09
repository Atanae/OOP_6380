package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {
    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name, float volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) &&
                        hotDrink.getVolume() == volume &&
                        hotDrink.getTemperature() == temperature) {
                    products.remove(hotDrink);
                    return hotDrink;
                }
            }
        }
        System.out.println("Не найден " + name + ' ' + volume + " мл " + temperature + " градусов");
        return null;
    }
}