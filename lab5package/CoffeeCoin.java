package lab5package;
public enum CoffeeCoin {
    QUARTER(0.25), DIME(0.1), NICKEL(0.05), PENNY(0.01);

    private double value;

    CoffeeCoin(double value) {
        this.value = value;
    }

    public static double getValue(String coin) {
        switch (coin.toLowerCase()) {
            case "quarters":
            case "quarter":
                return QUARTER.value;
            case "dimes":
            case "dime":
                return DIME.value;
            case "nickels":
            case "nickel":
                return NICKEL.value;
            case "pennies":
            case "penny":
                return PENNY.value;
            default:
                throw new IllegalArgumentException("Invalid coin.");
        }
    }
}
