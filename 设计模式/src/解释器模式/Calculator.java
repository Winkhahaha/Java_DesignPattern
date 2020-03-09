package 解释器模式;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    // 定义表达式
    private Expression expression;

    public Calculator(String expStr) { // expStr = a+b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();// [a, +, b]

        Expression left = null;
        Expression right = null;
        // 遍历字符数组:[a, +, b]
        // 针对不同的情况做相应处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();// 从stack取出left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i]));  // 取出右表达式
                    stack.push(new AddExpression(left, right)); // 根据得到的左和右构建加表达式加入栈
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个Var就创建一个VarExpression对象并push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个charArray,stack中就得到了最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        // 最后将表达式和var = {a=10,b=20}绑定,准备对应数字
        // 传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}