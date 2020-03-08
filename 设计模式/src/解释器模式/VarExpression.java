package 解释器模式;

import java.util.HashMap;


/**
 * 变量的解析器
 *
 * @author Administrator
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var:{a=10, b=20}
    // interpreter:根据变量名称,返回在map中对应的值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
