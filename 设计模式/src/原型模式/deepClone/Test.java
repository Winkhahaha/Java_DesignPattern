package 原型模式.deepClone;

import java.io.IOException;

public class Test {
    public static void main(String args[]) throws CloneNotSupportedException, IOException {
        DeepSheepFriend deepSheepFriend = new DeepSheepFriend();
        deepSheepFriend.name = "肖恩";
        deepSheepFriend.deepSheep = new DeepSheep("托马斯", "白色");
        System.out.println(deepSheepFriend);

        // deepCopy01(deepSheepFriend);

        System.out.println("深拷贝方式二:");
        DeepSheepFriend deepSheepFriend2 = (DeepSheepFriend) deepSheepFriend.deepCloneBySerializable();
        System.out.println(deepSheepFriend2);
        System.out.println(deepSheepFriend == deepSheepFriend2);    // false
        System.out.println(deepSheepFriend.deepSheep.hashCode());   // 不相同
        System.out.println(deepSheepFriend2.deepSheep.hashCode());
    }

    private static void deepCopy01(DeepSheepFriend deepSheepFriend) throws CloneNotSupportedException {
        System.out.println("深拷贝方式一:");
        DeepSheepFriend deepSheepFriend1 = (DeepSheepFriend) deepSheepFriend.clone();
        System.out.println(deepSheepFriend1);
        System.out.println(deepSheepFriend == deepSheepFriend1);    // false
        System.out.println(deepSheepFriend.deepSheep.hashCode());   // 不相同
        System.out.println(deepSheepFriend1.deepSheep.hashCode());
    }
}
