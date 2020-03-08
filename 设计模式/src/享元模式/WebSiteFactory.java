package 享元模式;

import java.util.HashMap;

// 网站工厂类,根据需求返回一个网站
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据网站类型,返回一个网站,没有就创建,并放入池中
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类总数(池中有多少)
   public int getWebSiteCount() {
        return pool.size();
    }
}
