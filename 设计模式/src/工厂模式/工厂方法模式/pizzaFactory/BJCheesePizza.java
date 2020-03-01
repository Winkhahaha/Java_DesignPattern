package 工厂模式.工厂方法模式.pizzaFactory;

import 工厂模式.简单工厂模式.pizza.Pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京奶酪pizza");
		System.out.println("准备*北京奶酪*原材料");
	}

}
