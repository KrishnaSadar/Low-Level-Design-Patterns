package VisitorDesignPattern.ConcretePatient;

import VisitorDesignPattern.Patient;
import VisitorDesignPattern.Visitor;

public class ChildPatient implements Patient {

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
