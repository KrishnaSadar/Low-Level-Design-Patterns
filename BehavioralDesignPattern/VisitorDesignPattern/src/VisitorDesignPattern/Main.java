package VisitorDesignPattern;

import VisitorDesignPattern.ConcretePatient.AdultPatient;
import VisitorDesignPattern.ConcretePatient.ChildPatient;
import VisitorDesignPattern.ConcretePatient.SeniorPatient;
import VisitorDesignPattern.ConcreteVisitor.BillingVisitor;
import VisitorDesignPattern.ConcreteVisitor.DignosisVisitor;

public class Main {
    public static void main(String[] args){
        Patient childPatient=new ChildPatient();
        Patient adultPatient=new AdultPatient();
        Patient seniorPatient=new SeniorPatient();

        Visitor billingVisitor=new BillingVisitor();
        Visitor dignosisVisitor=new DignosisVisitor();

        adultPatient.accept(billingVisitor);
        seniorPatient.accept(dignosisVisitor);
    }
}
