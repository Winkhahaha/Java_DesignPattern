package 迭代器模式;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        // 创建学院集合(学校)
        ArrayList<College> colleges = new ArrayList<>();
        // 创建学院
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        // 将学院加入到学院集合
        colleges.add(computerCollege);
        colleges.add(infoCollege);
        // 给各个学院增设专业
        computerCollege.addDepartment("软件工程", "搬砖的");
        infoCollege.addDepartment("信息学", "解密的");

        // 遍历
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }

}
