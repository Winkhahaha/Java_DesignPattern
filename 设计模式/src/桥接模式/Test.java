package 桥接模式;

public class Test {
    public static void main(String args[]) {
        // 获取手机(品牌+样式)
        new FoldedPhone(new ABrand()).call();
        new FoldedPhone(new BBrand()).call();
        System.out.println("--------------");
        new UpRightPhone(new ABrand()).call();
        new UpRightPhone(new BBrand()).call();

    }
}
