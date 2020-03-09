package 职责链模式.审批人;

import 职责链模式.Request;

public class CApprover extends Approver {
    public CApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        //如果请求的金额
        if (request.getPrice() > 10000 && request.getPrice() <= 20000) {
            // 则由C审批人处理
            System.out.println("请求编号: " + request.getId());
            System.out.println("请求金额: " + request.getPrice());
            System.out.println("该请求审批人: " + this.name);
        } else {
            // 否则,就让与C关联的下一个审批人处理
            approver.processRequest(request);
        }
    }
}
