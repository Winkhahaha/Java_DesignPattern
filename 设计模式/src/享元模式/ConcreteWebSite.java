package 享元模式;

public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("当前使用者:" + user.getName());
        System.out.println("网站的发布形式为:" + type);
    }
}
