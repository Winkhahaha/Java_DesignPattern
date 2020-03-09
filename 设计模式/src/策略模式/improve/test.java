package 策略模式.improve;

import 策略模式.improve.duck.ToyDuck;
import 策略模式.improve.duck.WildDuck;
import 策略模式.improve.duck.YellowDuck;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String args[]) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        YellowDuck yellowDuck = new YellowDuck();
        yellowDuck.fly();

//      Integer a[] = {3,6,7};
//        Arrays.sort(a);
//        Arrays.sort(a,(aa,b)->{
//            if (aa.compareTo(b)>0){
//                return 1;
//            }else {
//                return -1
//            }
//        });
    }
}
