package demo.dp.a.singleton;

import demo.dp.a.singleton.Singleton;

/**
 *  A test for SingletonA
 */
public class TestClient  {
    public static void main(String[] args) {
        // Can not create a instance !
    	//Singleton instance1 = new Singleton();  
        Singleton instance2 = Singleton.getInstance();
        System.out.println("This is instance2:"+instance2);
        Singleton instance3 = Singleton.getInstance();
        System.out.println("This is instance3:"+instance3); 
    }
}