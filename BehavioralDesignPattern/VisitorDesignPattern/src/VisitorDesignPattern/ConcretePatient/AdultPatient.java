package VisitorDesignPattern.ConcretePatient;

import VisitorDesignPattern.Patient;
import VisitorDesignPattern.Visitor;

public class AdultPatient implements Patient {
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
