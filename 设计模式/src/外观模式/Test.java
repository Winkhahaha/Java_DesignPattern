package 外观模式;

public class Test {
    public static void main(String args[]){
        CoreTools tools = new CoreTools();
        System.out.println("1:");
        tools.ready();
        System.out.println("2:");
        tools.play();
        System.out.println("3:");
        tools.pause();
        System.out.println("4:");
        tools.end();
    }
}
