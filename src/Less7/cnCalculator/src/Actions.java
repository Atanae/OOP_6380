public enum Actions {
    PLUS("Сумма"), MINUS("Разность"), MULTI("Умножить"), DIVIDE("Разделить");
    private final String action;
    Actions(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }
}
