package VisitorDesignPattern;

import VisitorDesignPattern.ConcretePatient.*;

public interface Visitor {
    public void visit(ChildPatient childPatient);
    public void visit(AdultPatient adultPatient);
    public void visit(SeniorPatient seniorPatient);
}
