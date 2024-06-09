package less1.practice;

import less1.practice.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        Product hotcup1 = new HotDrink("Капучино", 150, LocalDate.now(), true,
                45, 200F, Drinks.COFFEE.getDrink());
        Product hotcup2 = new HotDrink("Greenfield", 100, LocalDate.now()) ;
        Product hotcup3 = new HotDrink("HotChoco", 250, LocalDate.now(), true, 25,
                250, Drinks.HOT_CHOCOLATE.getDrink());

        VendingMachine vm_hd = new HotDrinkVM();
        System.out.println(vm_hd.getProducts());

        vm_hd.addProducts(List.of(hotcup1, hotcup1, hotcup2, hotcup2, hotcup3));
        System.out.println(vm_hd.getProducts());
        vm_hd.getProduct("Greenfield", 250, 40 );
        System.out.println(vm_hd.getProducts());
    }
}
