package 代理模式.Cglib代理;

public class TeacherDao {
    public String teach(String name){
        System.out.println("我是cglib代理,不需要实现接口");
        System.out.println("老师上课中...");
        return name;
    }
}
