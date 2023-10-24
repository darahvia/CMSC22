package lab5package;

public class ResourceManager {
    private int water;
    private int milk;
    private int beans;
    private double money;

    public ResourceManager(int water, int milk, int beans, double money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
    }

    public boolean checkResources(Coffee coffee) {
        return water >= coffee.getWaterCost() && milk >= coffee.getMilkCost() && beans >= coffee.getBeansCost();
    }

    public void makeCoffee(Coffee coffee) {
        water -= coffee.getWaterCost();
        milk -= coffee.getMilkCost();
        beans -= coffee.getBeansCost();
    }

    public void addProfit(double amount) {
        money += amount;
    }

    public void printReport() {
        System.out.println("Water: " + water + "ml");
        System.out.println("Milk: " + milk + "ml");
        System.out.println("Beans: " + beans + "g");
        System.out.println("Money: $" + money);
    }
}
