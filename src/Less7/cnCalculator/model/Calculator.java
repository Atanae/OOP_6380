package cnCalculator.model;

import cnCalculator.model.ComplexNumber;

public interface Calculator {
        ComplexNumber add(ComplexNumber a, ComplexNumber b);
        ComplexNumber subtract(ComplexNumber a, ComplexNumber b);
        ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
        ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}
