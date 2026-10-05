package MediatorDesignPattern.ConcreteClasses;

import MediatorDesignPattern.AuctionMediator;

import java.util.ArrayList;
import java.util.List;

public class AunctionHouse implements AuctionMediator {
    List<Bidder>bidders=new ArrayList<>();
    int amount;
    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder,int amount) {
        this.amount=amount;
        System.out.println(bidder.getName()+ " places new bid of "+amount+" rupees");
        for(Bidder b:bidders){
            if(b!=bidder){
                b.reciveBid(bidder,amount);
            }
        }
    }
}
