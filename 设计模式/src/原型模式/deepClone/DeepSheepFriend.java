package 原型模式.deepClone;

import java.io.*;

public class DeepSheepFriend implements Serializable, Cloneable {
    public String name;
    public DeepSheep deepSheep;

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepSheep=" + deepSheep +
                '}';
    }

    // 深拷贝方式一,使用克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        // 对引用类型(对象)单独处理
        // 1.先获得当前实例的克隆
        DeepSheepFriend deepSheepFriend = (DeepSheepFriend) deep;
        // 2.再调用当前实例的引用对象其本身的克隆方法,就该成员应用自克隆
        deepSheepFriend.deepSheep = (DeepSheep) deepSheep.clone();
        // 3.完成深拷贝,返回当前实例
        return deepSheepFriend;
    }

    // 深拷贝方式二,使用对象的序列化实现(推荐)
    public Object deepCloneBySerializable() throws IOException {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 把当前对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepSheepFriend copy = (DeepSheepFriend) ois.readObject();
            return copy;
        } catch (Exception e) {
                e.printStackTrace();
                return null;
        }finally {
            bos.close();
            bis.close();
            ois.close();
            oos.close();
        }
    }
}
