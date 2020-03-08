package 组合模式;

import java.util.ArrayList;
import java.util.List;

// 管理department
public class College extends OrganizationComponent {

    List<OrganizationComponent> departments = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        departments.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        departments.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("---------" + getName() + "---------");
        System.out.println("---------" + getDes() + "---------");
        for (OrganizationComponent department : departments) {
            department.print();
        }
    }
}
