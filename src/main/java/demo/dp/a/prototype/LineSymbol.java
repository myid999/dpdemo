package demo.dp.a.prototype;

import demo.dp.a.prototype.Graphic;

/*
 *  A concrete prototype to draw a line
 */
public class LineSymbol extends Graphic {
	
	int length;
	
    public LineSymbol(String name, int length) {
    	this.name=name;
    	this.length=length;
    }

    public void draw() {
        System.out.println("This is a line:"+this);
    }
    
    public Object clone() {
    	System.out.println("This is original line:"+this);
        	LineSymbol newLine = new LineSymbol(this.name,this.length);
            return newLine;
    }    
    
}