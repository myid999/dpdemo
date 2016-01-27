package demo.dp.c.interpreterA;

import java.util.Map;

public class SubExpression extends SymbolExpression {
	public SubExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// 左右两个表达式相减
	public int interpreter(Map<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
