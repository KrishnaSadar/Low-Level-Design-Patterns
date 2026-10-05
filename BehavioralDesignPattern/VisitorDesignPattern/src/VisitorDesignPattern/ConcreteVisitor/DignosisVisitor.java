package VisitorDesignPattern.ConcreteVisitor;

import VisitorDesignPattern.ConcretePatient.AdultPatient;
import VisitorDesignPattern.ConcretePatient.ChildPatient;
import VisitorDesignPattern.ConcretePatient.SeniorPatient;
import VisitorDesignPattern.Visitor;

public class DignosisVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Diagnosing Child Patient");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Diagnosing Adult Patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Diagnosing Senior Patient");
    }
}
