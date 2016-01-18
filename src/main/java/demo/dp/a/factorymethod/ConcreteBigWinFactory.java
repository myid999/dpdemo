package demo.dp.a.factorymethod;

/**
 * 
 */

public class ConcreteBigWinFactory extends Factory {

	@Override
	public void createWindow() {
		window = new WindowBig();
	}
    
    
    
    

}