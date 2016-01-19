package demo.dp.b.composite;

import java.util.List;

public interface ITree {

	public void add(ITree item);
	public void remove(ITree item);
	public ITree getParent();
	public void setParent(ITree item);
	public List<ITree> getChildren();
	public void printInfo();
	public String getName();
	
}
