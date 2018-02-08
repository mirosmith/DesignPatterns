package chain_of_responsibility;

public class VenusHandler extends PlanetHandler {

    @Override
    public void hadleRequest(PlanetEnum planet) {
	
	if (planet == PlanetEnum.VENUS) {
	    System.out.println("VenusHandler handles the " + planet);
	}
	else {
	    System.out.println("VenusHandler cannot handle " + planet + " request.");
	    PlanetHandler succ = this.getSuccessor();
	    if (succ != null) {
		succ.hadleRequest(planet);
	    }
	}
	
    }

}
