package 职责链模式.审批人;

import 职责链模式.Request;

// 抽象审批人
public abstract class Approver {
    // 当前审批人的下级或上级
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    // 设置上级或是下级
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法,处理是子类完成,所以定义为抽象
    public abstract void processRequest(Request request);
}
