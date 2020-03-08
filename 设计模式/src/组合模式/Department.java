package 组合模式;

// Department是最小级别(叶子结点),不再需要add和remove
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName() + ":" + getDes());
    }

}
