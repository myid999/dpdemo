package demo.dp.a.factorymethod;
/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的
实例化延迟到其子类。
 *
 */
public abstract class Factory {

	Window window;
	
	/**
	 * 用于创建目标对象的方法，可以延迟到子类中再具体实现
	 * 也可以在此处提供默认实现
	 */
	public abstract void createWindow();
	
	public Window getWindow(){
		createWindow();
		return window;
	}
}
