package chain_of_responsibility;

public class EarthHandler extends PlanetHandler {

    @Override
    public void hadleRequest(PlanetEnum planet) {
	
	if (planet == PlanetEnum.EARTH) {
	    System.out.println("EarthHandler handles the " + planet);
	}
	else {
	    System.out.println("EarthHandler cannot handle " + planet + " request.");
	    PlanetHandler succ = this.getSuccessor();
	    if (succ != null) {
		succ.hadleRequest(planet);
	    }
	}
    }

}
