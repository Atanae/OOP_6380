package cnCalculator.logger;

import cnCalculator.logger.Logger;
import cnCalculator.model.ComplexNumber;

public class CalculatorLogger implements Logger {
    @Override
    public void logOperation(String operation, ComplexNumber a, ComplexNumber b, ComplexNumber result) {
        System.out.println("Действие: " + operation);
        System.out.println("Значение вещественное " + a);
        System.out.println("Значение мнимое: " + b);
    }
}