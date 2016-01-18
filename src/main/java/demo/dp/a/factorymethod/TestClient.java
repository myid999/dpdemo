package demo.dp.a.factorymethod;

/*
 *  A test client 
 */
public class TestClient  {
    public TestClient() {
    }

    // The Main function only for our test
    public static void main(String[] args) {
        Factory myFactory = new ConcreteBigWinFactory();
        Window myBigWindow = myFactory.getWindow();
        myBigWindow.func();

        Factory myFactoryS = new ConcreteSmallWinFactory();
        Window mySmallWindow = myFactoryS.getWindow();
        mySmallWindow.func();
    }
}