package 适配器模式.类适配器;

class Phone {
    public void charging(Voltage5V voltage5V) {
        int charge = voltage5V.output5V();  // 调用具体传入的适配器的方法
        if (charge == 5) {
            System.out.println("适配成功!");
            System.out.println("正在充电...电压为:" + charge + "V");
        } else {
            System.out.println("当前电压无法进行充电!");
        }
    }
}
