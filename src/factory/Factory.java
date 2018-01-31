package factory;

public final class Factory {    
    
    public static Clothes getClothes(String what, String brand, String color) {	
	
	switch (what) {
	
	case "tshirt" : return new Tshirt(brand, color); 
	
	case "jeans" : return new Jeans(brand, color);
	
	default : return null;
	
	}	
	
    }  
    

}
