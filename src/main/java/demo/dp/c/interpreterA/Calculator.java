package demo.dp.c.interpreterA;

import java.util.Map;
import java.util.Stack;

/**
 * 
 * 
Calculator构造函数接收一个表达式，然后把表达式转化为char数组，并判断运算符号，
如果是“+”则进行加法运算，把左边的数（left变量）和右边的数（right变量）加起来就可以了，
那左边的数为什么是在堆栈中呢？例如这个公式：a+b-c，根据for循环，
首先被压入堆栈中的应该是有a元素生成的VarExpression对象，然后判断到加号时，
把a元素的对象VarExpression从堆栈中弹出，与右边的数组b进行相加，b又是怎么得来的呢？
当前的数组游标下移一个单元格即可，同时为了防止该元素再次被遍历，则通过++i的方式跳过
下一个遍历——于是一个加法的运行结束。减法也是相同的运行原理。
 *
 */
public class Calculator {
	// 定义的表达式
	private Expression expression;

	// 构造函数传参,并解析
	public Calculator(String expStr) {

		// 定义一个堆栈，安排运算的先后顺序

		Stack<Expression> stack = new Stack<Expression>();

		// 表达式拆分为字符数组

		char[] charArray = expStr.toCharArray();

		// 运算

		Expression left = null;

		Expression right = null;

		for (int i = 0; i < charArray.length; i++) {

			switch (charArray[i]) {

			case '+': // 加法

				// 加法结果放到堆栈中

				left = stack.pop();

				right = new VarExpression(String.valueOf(charArray[++i]));

				stack.push(new AddExpression(left, right));
 
				break;

			case '-':

				left = stack.pop();

				right = new VarExpression(String.valueOf(charArray[++i]));

				stack.push(new SubExpression(left, right));

				break;

			default: // 公式中的变量

				stack.push(new VarExpression(String.valueOf(charArray[i])));

			}

		}

		// 把运算结果抛出来

		this.expression = stack.pop();

	}

	// 开始运算

	public int run(Map<String, Integer> var) {

		return this.expression.interpreter(var);

	}
}
