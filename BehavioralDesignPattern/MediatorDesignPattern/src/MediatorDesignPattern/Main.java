package MediatorDesignPattern;

import MediatorDesignPattern.ConcreteClasses.AunctionHouse;
import MediatorDesignPattern.ConcreteClasses.Bidder;

public class Main {
    public static void main(String[] args){
        AuctionMediator mediator=new AunctionHouse();
        Bidder alice=new Bidder("alice",mediator);
        Bidder john=new Bidder("john",mediator);
        Bidder bob=new Bidder("bob",mediator);
        mediator.registerBidder(alice);
        mediator.registerBidder(john);
        mediator.registerBidder(bob);
        alice.placeBid(100);
        john.placeBid(900);
        bob.placeBid(1100);
    }
}
