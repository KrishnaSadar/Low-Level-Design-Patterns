package TemplateDesginPattern.ConcreteBeverages;

import TemplateDesginPattern.Beverages;

public class CoffeBeverage extends Beverages {

    @Override
    public void brew(){
        System.out.println("Brewing the coffe........");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding the matcha over it..");
    }
}
