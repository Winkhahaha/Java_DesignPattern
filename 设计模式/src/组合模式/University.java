package 组合模式;

import java.util.ArrayList;
import java.util.List;

// 管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> colleges = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        colleges.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        colleges.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("        " + getName() + "       ");
        System.out.println("        " + getDes() + "      ");
        for (OrganizationComponent college : colleges) {
            college.print();
        }
    }
}
