package demo.dp.b.adapter;

/**
 * The Class Adapter in this sample
 * 此适配器通过继承来引入需要适配的类
 * 实现Shape接口来提供统一的操作接口
 * 
 */
public class TextShapeClassAdapter extends Text implements Shape {
	public TextShapeClassAdapter() {
	}

	public void Draw() {
		System.out.println("Draw a shap ! Impelement Shape interface !");
	}

	public void Border() {
		System.out.println("Set the border of the shap ! Impelement Shape interface !");
	}

	public static void main(String[] args) {
		TextShapeClassAdapter myTextShapeClass = new TextShapeClassAdapter();
		myTextShapeClass.Draw();
		myTextShapeClass.Border();
		myTextShapeClass.SetContent("A test text !");
		System.out.println("The content in Text Shape is :" + myTextShapeClass.GetContent());
	}
}