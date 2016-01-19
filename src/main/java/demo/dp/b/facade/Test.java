package demo.dp.b.facade;

/**
 *  A very simple test
 *  facade 作为子系统的操作界面，提供一组常用的操作，
 *  避免用户对底层操作的直接调用，使这些操作相对容易管理，扩展
 *  但同时，子系统依然可以提供底层操作的接口，如果需要用户还是可以调用它们来完成操作
 *  
 *  
 */
import java.io.*;

class Wall {
	public Wall() {
		System.out.println("Create a wall !");
	}
}

class Door {
	public Door() {
		System.out.println("Create a door !");
	}
}

class FacadeRoom {
	public void CreateRoom() {
		Wall wall1 = new Wall();
		Wall wall2 = new Wall();
		Wall wall3 = new Wall();
		Wall wall4 = new Wall();
		Door door = new Door();
	}

}

public class Test {
	public static void main(String[] args) {
		FacadeRoom room = new FacadeRoom();
		room.CreateRoom();
	}
}