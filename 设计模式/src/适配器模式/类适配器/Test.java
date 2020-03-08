package 适配器模式.类适配器;

public class Test {
    public static void main(String args[]){
        System.out.println("类适配器:");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
