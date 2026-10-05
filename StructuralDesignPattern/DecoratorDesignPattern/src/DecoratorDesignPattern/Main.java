package DecoratorDesignPattern;

import DecoratorDesignPattern.ConcreteCoffeClasses.Cappuccino;
import DecoratorDesignPattern.ConcreteCoffeClasses.Espresso;
import DecoratorDesignPattern.Decorators.MilkDecorator;
import DecoratorDesignPattern.Decorators.SugarDecorator;
import DecoratorDesignPattern.Decorators.VanillaDecorator;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
        Coffee anotherCoffee = new Cappuccino();
        anotherCoffee = new VanillaDecorator(anotherCoffee);
        System.out.println(" Order: " + anotherCoffee.getDescription());
        System.out.println("Total Cost: $" + anotherCoffee.getCost());
    }
}
