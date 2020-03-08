package 代理模式.动态JDK代理;

class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在上课中");
    }

    @Override
    public String subject(String name) {
        System.out.println("正在上的课:" + name);
        return name;
    }
}
