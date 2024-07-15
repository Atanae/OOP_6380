package cnCalculator.view;

import cnCalculator.logger.CalculatorLogger;
import cnCalculator.model.Actions;
import cnCalculator.controller.CalculatorController;
import cnCalculator.model.ComplexNumber;
import cnCalculator.service.ComplexCalculator;

import java.util.Scanner;

public class CalculatorView {
    private final CalculatorController controller;
    private final Scanner scanner;

    public CalculatorView() {
        this.controller = new CalculatorController(new ComplexCalculator(), new CalculatorLogger());
        this.scanner = new Scanner(System.in); // Инициализация Scanner здесь
    }

    public void start() {
        System.out.println("Калькулятор комплексных чисел");

 //       Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что будем считать?");
            System.out.println("1. " + Actions.PLUS.getAction());
            System.out.println("2. " + Actions.MINUS.getAction());
            System.out.println("3. " + Actions.MULTI.getAction());
            System.out.println("4. " + Actions.DIVIDE.getAction());
            System.out.println("0. Ничего, закончить");
            System.out.print("Выберите действие -> ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.exit(0);
            }

            switch (choice) {
                case 1, 2, 3, 4 -> {
                    ComplexNumber number1 = inputComplexNumber(scanner, "первого");
                    ComplexNumber number2 = inputComplexNumber(scanner, "второго");
                    ComplexNumber result = null;

                     switch (choice) {
                        case 1 -> result = controller.add(number1, number2);
                        case 2 -> result = controller.subtract(number1, number2);
                        case 3 -> result = controller.multiply(number1, number2);
                        case 4 -> result = controller.divide(number1, number2);
                    }
                    System.out.println("Результат " + result);
                }
                default -> System.out.println("Неправильное действие, повторите");
            }
        }
    }
        private ComplexNumber inputComplexNumber(Scanner scanner, String ordinal) {
            System.out.printf("Введите вещественную часть %s числа: ", ordinal);
            double real = scanner.nextDouble();
            System.out.printf("Введите мнимую часть %s числа: ", ordinal);
            double imaginary = scanner.nextDouble();
            return new ComplexNumber(real, imaginary);
        }
}
