package DecoratorDesignPattern.ConcreteCoffeClasses;

import DecoratorDesignPattern.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }
    @Override
    public double getCost() {
        return 3.00;
    }
}
