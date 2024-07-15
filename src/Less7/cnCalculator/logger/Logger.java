package cnCalculator.logger;

import cnCalculator.model.ComplexNumber;

public interface Logger {
    public void logOperation(String action, ComplexNumber a, ComplexNumber b, ComplexNumber result);
}
