package 解释器模式;

import java.util.HashMap;

/**
 * 运算符号解析器,每个运算符号都只和自己左右两边数字有关系
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;	// 左边数字
	protected Expression right;	// 右边数字

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	// 默认实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
