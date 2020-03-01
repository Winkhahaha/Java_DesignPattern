package 工厂模式.简单工厂模式.pizzaFactory;

import 工厂模式.简单工厂模式.pizza.Pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备胡椒原材料");
	}

}
