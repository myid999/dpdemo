package demo.dp.a.factorymethod;

/**
 * 
 */

public class ConcreteSmallWinFactory extends Factory {

	@Override
	public void createWindow() {
		window = new WindowSmall();
	}
    
    
    
    

}