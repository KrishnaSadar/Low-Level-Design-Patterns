package ChainOfResponsibility.ConcreteApprovers;

import ChainOfResponsibility.Approver;

public class Supervisor extends Approver {

    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=3){
            System.out.println("Supervisor approves the leave.");
        }else if(nextApprover!=null){
           nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
