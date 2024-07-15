package cnCalculator.controller;

import cnCalculator.model.Calculator;
import cnCalculator.logger.Logger;
import cnCalculator.model.Actions;
import cnCalculator.model.ComplexNumber;

public class CalculatorController {
    private final Calculator calculator;
    private final Logger logger;

    public CalculatorController(Calculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        logger.logOperation(Actions.PLUS.getAction(), a, b, result);
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.subtract(a, b);
        logger.logOperation(Actions.MINUS.getAction(), a, b, result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.logOperation(Actions.MULTI.getAction(), a, b, result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.logOperation(Actions.DIVIDE.getAction(), a, b, result);
        return result;
    }
}
