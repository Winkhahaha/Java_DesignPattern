package 享元模式;

public class Test {
    public static void main(String args[]) {
        WebSiteFactory factory = new WebSiteFactory();
        // 客户要新闻形式
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("张三"));

        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("李四"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("王麻子"));

        System.out.println("网站的形式种类数:" + factory.getWebSiteCount());
    }
}
