package ChainOfResponsibility.ConcreteApprovers;

import ChainOfResponsibility.Approver;

public class Manager extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays){
        if(leaveDays<=7){
            System.out.println("Managers Approves the leave request..");
        }else if(nextApprover!=null){
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
