package 解释器模式;

import java.util.HashMap;

/**
 * 抽象类表达式,通过HashMap键值对,可以获得变量的值
 * 
 * @author Administrator
 *
 */
public abstract class Expression {
	// k(a,b,c)就是表达式参数,v(1,2,3)就是具体的值
	// a + b - c
	// HashMap {a=10, b=20...}
	public abstract int interpreter(HashMap<String, Integer> var);
}
