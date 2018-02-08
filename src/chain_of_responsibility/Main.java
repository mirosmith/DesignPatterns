package chain_of_responsibility;

public class Main {
    
    public static PlanetHandler setUpChain() {
	
	PlanetHandler mercury = new MercuryHandler();
	PlanetHandler venus = new VenusHandler();
	PlanetHandler earth = new EarthHandler();
	
	mercury.setPlanetHandler(venus);
	venus.setPlanetHandler(earth);
	
	return mercury;
	
    }

    public static void main(String[] args) {
	
	PlanetHandler planetOne = setUpChain();
	
	planetOne.hadleRequest(PlanetEnum.EARTH);
	System.out.println();
	planetOne.hadleRequest(PlanetEnum.MERCURY);
	System.out.println();
	planetOne.hadleRequest(PlanetEnum.SATURN);

    }

}
