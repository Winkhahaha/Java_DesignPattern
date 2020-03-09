package 职责链模式.审批人;

import 职责链模式.Request;

// 抽象审批人
public abstract class Approver {
    // 当前审批人的下级或上级
    Approver approver;
    String name;
    // 设置责任链上的最大节点(官员)数
    private static final int maxApprovers = 3;
    // 设置责任链上的当前节点数
    private static int count = 0;

    public Approver(String name) {
        this.name = name;
    }

    // 设置上级或是下级
    public void setApprover(Approver approver) {
        // 相关子类每调用一次setApprover,都会对count进行自增处理再与maxApprovers进行比较
        if (++count <= maxApprovers) {
            this.approver = approver;
        } else {
            System.out.println("已达到责任链的最大节点数!不允许继续添加!");
        }
    }

    // 处理审批请求的方法,处理是子类完成,所以定义为抽象
    public abstract void processRequest(Request request);
}
