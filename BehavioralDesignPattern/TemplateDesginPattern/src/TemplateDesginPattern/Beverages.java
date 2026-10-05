package TemplateDesginPattern;

public abstract class Beverages {
    final public void prepareBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    private void boilWater(){
        System.out.println("Boiling the water....");
    }
    private void pourIntoCup(){
        System.out.println("Pouring into the Cup...");
    }
   public abstract void brew();
   public abstract void addCondiments();
}
