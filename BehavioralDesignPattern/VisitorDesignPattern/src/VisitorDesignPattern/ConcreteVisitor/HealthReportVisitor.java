package VisitorDesignPattern.ConcreteVisitor;

import VisitorDesignPattern.ConcretePatient.AdultPatient;
import VisitorDesignPattern.ConcretePatient.ChildPatient;
import VisitorDesignPattern.ConcretePatient.SeniorPatient;
import VisitorDesignPattern.Visitor;

public class HealthReportVisitor implements Visitor {
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Making health Report of Child Patient");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Making health Report of Adult Patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Making health Report of Senior Patient");
    }
}
