package MediatorDesignPattern.ConcreteClasses;

import MediatorDesignPattern.AuctionMediator;

public class Bidder {
    private String name;
    AuctionMediator mediator;

    public Bidder(String name,AuctionMediator mediator){
        this.name=name;
        this.mediator=mediator;
    }

    public String getName(){
        return this.name;
    }
    public void placeBid(int amount){
        mediator.placeBid(this,amount);
    }

    public void reciveBid(Bidder bidder,int amount){
        System.out.println(name+ " Receives the bid from: "+ bidder.getName()+"of "+amount+" rupees");
    }
}
