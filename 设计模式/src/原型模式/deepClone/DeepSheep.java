package 原型模式.deepClone;

import java.io.Serializable;

public class DeepSheep implements Cloneable, Serializable {
    private String name;
    private String color;
    //public DeepSheep friend; // 成员变量是对象,克隆如何处理

    public DeepSheep(String name, String color) {
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
        return "DeepSheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // 克隆该实例,使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
