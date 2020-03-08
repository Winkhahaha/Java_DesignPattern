package 代理模式.静态代理;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在上课...");
    }
}
