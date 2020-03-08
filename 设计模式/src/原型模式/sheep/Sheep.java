package 原型模式.sheep;

public class Sheep implements Cloneable{
    private String name;
    private String color;
    public Sheep friend; // 成员变量是对象,克隆如何处理

    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    // 克隆该实例,使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
