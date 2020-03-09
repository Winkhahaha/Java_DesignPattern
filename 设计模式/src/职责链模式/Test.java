package 职责链模式;

import 职责链模式.审批人.AApprover;
import 职责链模式.审批人.BApprover;
import 职责链模式.审批人.CApprover;
import 职责链模式.审批人.DApprover;

public class Test {
    public static void main(String args[]) {
        // 创建请求
        Request request = new Request(1, 155000);
        // 创建相关审批人
        AApprover aApprover = new AApprover("A员工");
        BApprover bApprover = new BApprover("B主任");
        CApprover cApprover = new CApprover("C经理");
        DApprover dApprover = new DApprover("D老板");
        // 创建责任链
        aApprover.setApprover(bApprover);
        bApprover.setApprover(cApprover);
        cApprover.setApprover(dApprover);
        dApprover.setApprover(null);
        // 尝试从A开始处理请求
        aApprover.processRequest(request);

    }
}
