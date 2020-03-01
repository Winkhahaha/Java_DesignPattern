package 工厂模式.简单工厂模式.pizzaFactory;

import 工厂模式.简单工厂模式.pizza.Pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备希腊原材料");
	}

}
