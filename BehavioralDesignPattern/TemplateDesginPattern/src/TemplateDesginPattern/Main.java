package TemplateDesginPattern;

import TemplateDesginPattern.ConcreteBeverages.CoffeBeverage;
import TemplateDesginPattern.ConcreteBeverages.TeaBeverage;

public class Main {
    public static void main(String[] args){
        Beverages tea=new TeaBeverage();
        Beverages coffe=new CoffeBeverage();
        tea.prepareBeverage();
        coffe.prepareBeverage();
    }
}
