package VisitorDesignPattern;

public interface Patient {
    public void accept(Visitor visitor);
}
