package DecoratorDesignPattern.ConcreteCoffeClasses;

import DecoratorDesignPattern.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }
    @Override
    public double getCost() {
        return 2.00;
    }
}
