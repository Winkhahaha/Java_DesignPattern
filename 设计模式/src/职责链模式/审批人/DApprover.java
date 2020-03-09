package 职责链模式.审批人;

import 职责链模式.Request;

public class DApprover extends Approver {
    public DApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        //如果请求的金额
        if (request.getPrice() > 20000) {
            // 则由D审批人处理
            System.out.println("请求编号: " + request.getId());
            System.out.println("请求金额: " + request.getPrice());
            System.out.println("该请求审批人: " + this.name);
        } else {
            // 否则,就让与D关联的下一个审批人处理
            approver.processRequest(request);
        }
    }
}
