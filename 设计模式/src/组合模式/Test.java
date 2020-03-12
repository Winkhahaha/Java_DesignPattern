package 组合模式;

public class Test {
    public static void main(String args[]) {
        // 从大到小,创建对象
        // 创建学校
        OrganizationComponent university = new University("A大学", "一个大学");
        // 创建学院
        OrganizationComponent college = new College("计算机学院", "搬砖");
        // 将学院加入到大学
        university.add(college);
        // 创建学院下的系(专业)
        college.add(new Department("软件工程", "搞软件的"));
        college.add(new Department("网络工程", "装宽带"));
        university.print();
        System.out.println("从学院级别遍历:");
        college.print();
    }
}
