package 职责链模式;

// 请求类
public class Request {
    private int id; // 请求编号
    private double price = 0.0;

    public Request(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
