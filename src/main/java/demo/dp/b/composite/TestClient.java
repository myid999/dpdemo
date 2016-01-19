package demo.dp.b.composite;

import java.util.List;

public class TestClient {

	public TestClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ITree container1 = new Container("container1");
		ITree container2 = new Container("container2");
		ITree item1 = new Item("item1");
		ITree item2 = new Item("item2");
		ITree item3 = new Item("item3");
		ITree item4 = new Item("item4");

		container1.add(container2);
		container1.add(item1);
		item2.add(container1);
		container2.add(item3);
		container2.add(item4);
		
		container1.printInfo();
		
		
		
		
		
		
	}

}
