package demo.dp.b.composite;

import java.util.List;

/**
 *
 */
public class Item implements ITree {

	private ITree parent;
	private String name;
	
	
	public Item(String name) {
		this.name=name;
	}

	public void add(ITree container) {
		setParent(container);

	}

	public void remove(ITree item) {
		if(this.equals(item)){
			parent.remove(item);
		}
		

	}

	public ITree getParent() {
		return parent;
	}

	public void setParent(ITree container) {
		container.getChildren().add(this);
		parent = container;
		
	}

	public List<ITree> getChildren() {
		return null;
	}

	public void printInfo() {
		System.out.println(this.parent.getName()+"-->"+this.name);
	}

	public String getName() {
		return this.name;
	}

}
