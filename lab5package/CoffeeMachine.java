package lab5package;

import java.util.Scanner;

public class CoffeeMachine {
    private ResourceManager resourceManager;
    private Coffee coffee;

    public CoffeeMachine() {
        resourceManager = new ResourceManager(1000, 1000, 500, 0);
        coffee = new CoffeeLatte(); // Example: Latte is the default coffee type
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean machineOn = true;

        while (machineOn) {
            System.out.println("What would you like? (espresso/latte/cappuccino/off/report):");
            String choice = scanner.nextLine();

            switch (choice) {
                case "espresso":
                case "latte":
                case "cappuccino":
                    processDrink(choice);
                    break;
                case "off":
                    machineOn = false;
                    break;
                case "report":
                    resourceManager.printReport();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void processDrink(String drinkType) {
        Coffee selectedCoffee;
        switch (drinkType) {
            case "espresso":
                selectedCoffee = new CoffeeEspresso();
                break;
            case "latte":
                selectedCoffee = new CoffeeLatte();
                break;
            case "cappuccino":
                selectedCoffee = new CoffeeCappuccino();
                break;
            default:
                return;
        }

        if (resourceManager.checkResources(selectedCoffee)) {
            double cost = selectedCoffee.getCost();
            double coinsInserted = insertCoins();

            if (coinsInserted < cost) {
                System.out.println("Sorry, not enough money. Money refunded.");
            } else {
                double change = coinsInserted - cost;
                resourceManager.addProfit(cost);
                if (change > 0) {
                    System.out.printf("Here is $%.2f in change.%n", change);
                }
                resourceManager.makeCoffee(selectedCoffee);
                System.out.println("Here is your " + selectedCoffee.getName() + ". Enjoy!");
            }
        } else {
            System.out.println("Sorry, there are not enough resources to make " + selectedCoffee.getName());
        }
    }

    private double insertCoins() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Please insert coins (quarters, dimes, nickels, pennies):");
        String coin;
        while (true) {
            coin = scanner.nextLine();
            if (coin.equals("done")) {
                break;
            } else if (coin.equals("cancel")) {
                return 0;
            }

            try {
                double value = CoffeeCoin.getValue(coin);
                total += value;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid coin. Please try again or type 'done' to finish.");
            }
        }

        return total;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }
}
