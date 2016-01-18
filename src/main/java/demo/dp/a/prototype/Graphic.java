package demo.dp.a.prototype;

/*
 * An Abstract Graphic Class ( Prototype )
 */
import java.io.*;

public abstract class Graphic implements Cloneable, Serializable {
    protected String name;
    
   
    public String getName() {
        return name;
    }
    
    public void setName(String gName) {
        name = gName;
    }
    
    public abstract void draw();
    public abstract Object clone();

}