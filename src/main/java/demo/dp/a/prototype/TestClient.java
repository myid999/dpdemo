package demo.dp.a.prototype;

/*
 *  As  a Test Client to test our pattern  
 */
import java.util.*;

import demo.dp.a.prototype.Graphic;

public class TestClient  {

    public static void main(String[] args) {
        //-----  Initial our prototype instance  ---------- 
    	PrototypeRegister prototypeRegister = new PrototypeRegister();
    	Map<String, Graphic> prototypes = prototypeRegister.getPrototypes();

        //-----  Draw a Line  -------------------------------
        Graphic myLine = (Graphic) prototypes.get("Line").clone();
        myLine.draw();
        
        Graphic myNote = (Graphic) prototypes.get("Note").clone();
        myNote.draw();
    }
}