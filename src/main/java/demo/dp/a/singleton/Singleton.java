package demo.dp.a.singleton;

/**
 *  A Singleton , we can only create one instance
 */
public class Singleton  {
    
	private static Singleton singleton;
	
    // Set constructor private and do nothing
    // Can not new a instance outside class
    private Singleton() {
    	
    }
    
    public static Singleton getInstance() {
        if(singleton==null) {
            singleton=new Singleton();
        }
        return singleton;
    }

}