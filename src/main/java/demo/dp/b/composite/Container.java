package demo.dp.b.composite;

import java.util.ArrayList;
import java.util.List;


/**
 * this is a composite 
 *
 */
public class Container implements ITree {

	private String name;
	private ITree parent;
	private List<ITree> itemList = new ArrayList<ITree>();
	
	public Container(String name) {
		this.name=name;
	}

	public void add(ITree item) {
		item.setParent(this);
	}

	public void remove(ITree item) {
			itemList.remove(item);
	}

	public ITree getParent() {
		return parent;
	}

	public void setParent(ITree container) {
		this.parent=container;
		container.getChildren().add(this);
	}

	public List<ITree> getChildren() {
		return itemList;
	}

	public void printInfo() {
		if(this.parent==null){
			System.out.println("null"+"-->"+this.name);
		}else{
			System.out.println(this.parent.getName()+"-->"+this.name);
		}
		
		
		for(ITree item: itemList){
			item.printInfo();
		}
		
		
		
	}

	public String getName() {
		return this.name;
	}

}
