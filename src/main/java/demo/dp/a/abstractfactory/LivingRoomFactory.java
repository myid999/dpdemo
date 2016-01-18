package demo.dp.a.abstractfactory;
/*
 * A concrete Room - LivingRoom
 */
public class LivingRoomFactory  extends RoomAbstractFactory {
    public LivingRoomFactory() {
        System.out.println("Initiated a living room !");
    }
    public Door makeDoor() {
        return new LivingRoomDoor();
    }
    public Wall makeWall() {
        return new LivingRoomWall();
    }
}