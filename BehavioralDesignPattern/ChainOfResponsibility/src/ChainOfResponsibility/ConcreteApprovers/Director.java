package ChainOfResponsibility.ConcreteApprovers;

import ChainOfResponsibility.Approver;

public class Director extends Approver {

    @Override
    public void processLeaveRequest(int leaveDay){
        if(leaveDay<=10){
            System.out.println("Director approve the request...");
        }else if(nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDay);
        }else{
            System.out.println("leave is rejected it is too big..");
        }
    }
}
