package demo.dp.a.prototype;
/*
 *  A Symbol Loader to register all prototype instance
 */
import java.util.*;

public class PrototypeRegister  {
    private Map<String, Graphic> prototypes = new HashMap<String, Graphic>();
    
    public PrototypeRegister() {
    	prototypes.put("Line", new LineSymbol("aline",1));
    	prototypes.put("Note", new NoteSymbol("aNote","noteText"));
    }
    public Map<String, Graphic> getPrototypes() {
        return prototypes;
    }
}