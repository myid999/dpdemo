package demo.dp.a.abstractfactory;

/*
 * A concrete Room - BedRoom
 * 工厂可以实现为单例
 * 
 */
public class BedRoomFactory  extends RoomAbstractFactory {
    public BedRoomFactory() {
        System.out.println("Initiated a bedroom !");
    }
    public Door makeDoor() {
        return new BedRoomDoor();
    }
    public Wall makeWall() {
        return new BedRoomWall();
    }
}