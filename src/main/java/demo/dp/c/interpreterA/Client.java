package demo.dp.c.interpreterA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 * 其中，getExpStr是从键盘事件中获得的表达式，getValue方法是从键盘事件中获得表达式中的元素映射值，运行过程如下。

      首先，要求输入公式。

请输入表达式：a+b-c

      其次，要求输入公式中的参数。

请输入a的值:100

请输入b的值:20

请输入c的值:40

      最后，运行出结果。

运算结果为：a+b-c=80
 * 
 * 
 *
 */
public class Client {
	// 运行四则运算

	public static void main(String[] args) throws IOException {

		String expStr = getExpStr();

		// 赋值

		Map<String, Integer> var = getValue(expStr);

		Calculator cal = new Calculator(expStr);

		System.out.println("运算结果为：" + expStr + "=" + cal.run(var));

	}

	// 获得表达式

	public static String getExpStr() throws IOException {

		System.out.print("请输入表达式：");

		return (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();

	}

	// 获得值映射

	public static Map<String, Integer> getValue(String exprStr)
			throws IOException {

		Map<String, Integer> map = new HashMap<String, Integer>();

		// 解析有几个参数要传递

		for (char ch : exprStr.toCharArray()) {

			if (ch != '+' && ch != '-') {

				// 解决重复参数的问题

				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("请输入" + ch + "的值:");

					String in = (new BufferedReader(new InputStreamReader(
							System.in))).readLine();

					map.put(String.valueOf(ch), Integer.valueOf(in));

				}

			}

		}

		return map;

	}
}
