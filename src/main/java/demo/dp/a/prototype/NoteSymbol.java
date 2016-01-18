package demo.dp.a.prototype;

import demo.dp.a.prototype.Graphic;

/*
 *  A concrete prototype to draw a note
 */
public class NoteSymbol extends Graphic {
	
	String note;
	
    public NoteSymbol(String name, String note) {
    	this.name = name;
    	this.note = note;
    	
    	
    }

    
    public Object clone() {
    	 System.out.println("This is a original note:"+this);
    	NoteSymbol newNote = new NoteSymbol(this.name,this.note);
        return newNote;
    }        
    
    public void draw() {
        System.out.println("This is a note:"+this);
    }
}