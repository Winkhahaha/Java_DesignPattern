package 工厂模式.抽象工厂模式;

import 工厂模式.简单工厂模式.pizza.Pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦奶酪pizza");
		System.out.println("准备*"+getName()+"*原材料");
	}

}
