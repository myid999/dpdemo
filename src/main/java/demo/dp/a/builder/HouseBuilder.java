package demo.dp.a.builder;

/*
 *  An abstract Builder
 *  定义建造product所需的基本元素/基本操作，但不应该涉及建造的逻辑，建造的逻辑放在director中
 *  以此实现建造对象的元素与逻辑的分离
 */
public abstract class HouseBuilder  {
    public abstract void BuildRoom(int roomNo);
    public abstract void BuildDoor(int room1, int room2);
    public abstract House getHouse();
}