package demo.dp.b.adapter;

/**
 *  The Object Adapter in this sample 
 *  此适配器通过引用目标类的实例来集成其功能
 *  实现Shape接口来提供统一的操作方式
 *  当我们需要适配的类有许多子类时，可以使用这种方式
 */
public class TextShapeObjectAdapter  implements Shape {
    private Text txt;
    public TextShapeObjectAdapter(Text t) {
        txt = t;
    }
    public void Draw() {
        System.out.println("Draw a shap ! Impelement Shape interface !");
    }
    public void Border() {
        System.out.println("Set the border of the shap ! Impelement Shape interface !");
    }
    
    public void SetContent(String str) {
        txt.SetContent(str);
    }
    public String GetContent() {
        return txt.GetContent();
    }

    public static void main(String[] args) {
        Text myText = new Text();
        TextShapeObjectAdapter myTextShapeObject = new TextShapeObjectAdapter(myText);
        myTextShapeObject.Draw();
        myTextShapeObject.Border();
        myTextShapeObject.SetContent("A test text !");
        System.out.println("The content in Text Shape is :" + myTextShapeObject.GetContent());
        
    }
}