package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * In the flyweight pattern, instead of creating large numbers of similar objects, objects are reused. 
 * 
 * Flyweight pattern tries to reuse already existing similar kind objects 
 * by storing them and creates new object when no matching object is found.
 *
 */
public class BodyPartsFactory {
    
    private static final Map<String, Part> map = new HashMap<>();    
        
    public static Part getPart(String what) {
	
	String lowerCasePart = what.toLowerCase();
	
	if (map.containsKey(lowerCasePart)) {
	    return map.get(lowerCasePart);
	}
	else {	    
	    
	    Part bodyPart = null;	    
	   
	    if (lowerCasePart.equals("hand")) {	
		
		bodyPart = new Hand();		
		map.put(lowerCasePart, bodyPart);
	    }
	    else if (lowerCasePart.equals("leg")){
		
		bodyPart = new Leg(); 		
		map.put(lowerCasePart, bodyPart);
	    }
	    else {
		System.out.println("not able to create " + lowerCasePart);		
	    }	    
	    
	    return bodyPart;
	}
	
    }
    

}
