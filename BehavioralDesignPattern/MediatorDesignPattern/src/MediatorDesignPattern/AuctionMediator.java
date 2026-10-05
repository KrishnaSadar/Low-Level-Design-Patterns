package MediatorDesignPattern;

import MediatorDesignPattern.ConcreteClasses.Bidder;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
