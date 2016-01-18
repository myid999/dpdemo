package demo.dp.a.builder;

/*
 *  This class is a Director
 *  此处引用builder，然后按照一定的逻辑建造product，不同的builder实现可以提供不同的product，
 *  但product的建造过程是确定的
 */
public class HouseDirector  {
	
	HouseBuilder concreteBuilder;
	
    public HouseDirector(HouseBuilder concreteBuilder) {
    	this.concreteBuilder = concreteBuilder;

	}
	
	public void createHouse(){
        concreteBuilder.BuildRoom(1);
        concreteBuilder.BuildRoom(2);
        concreteBuilder.BuildDoor(1, 2);
        //return builder.getHouse();
	}

}