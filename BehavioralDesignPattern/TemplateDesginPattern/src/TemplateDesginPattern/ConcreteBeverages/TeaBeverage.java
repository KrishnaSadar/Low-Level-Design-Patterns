package TemplateDesginPattern.ConcreteBeverages;

import TemplateDesginPattern.Beverages;

public class TeaBeverage extends Beverages {

    @Override
    public void brew(){
        System.out.println("Brewing the tea");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding sugur in tea....");
    }
}
