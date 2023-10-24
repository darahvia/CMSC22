package lab5package;

public abstract class Coffee {
    protected String name;
    protected int waterCost;
    protected int milkCost;
    protected int beansCost;
    protected double moneyCost;

    public String getName() {
        return name;
    }

    public int getWaterCost() {
        return waterCost;
    }

    public int getMilkCost() {
        return milkCost;
    }

    public int getBeansCost() {
        return beansCost;
    }

    public double getCost() {
        return moneyCost;
    }
}
