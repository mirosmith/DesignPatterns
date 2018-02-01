package factory;

public final class Factory {    
    
    public static Clothes getClothes(String what, String brand, String color) {
	
	if (what == null || brand == null || color == null) {
	    return null;
	}
	
	if (what.equalsIgnoreCase("tshirt")) {
	    return new Tshirt(brand, color);
	}
	else if (what.equalsIgnoreCase("jeans")) {
	    return new Jeans(brand, color);		
	}
	else {
	    return null;
	}
	
	/*
	switch (what) {
	
	case "tshirt" : return new Tshirt(brand, color); 
	
	case "jeans" : return new Jeans(brand, color);
	
	default : return null;
	
	}	
	*/
    }  
    

}
