package chain_of_responsibility;

public class MercuryHandler extends PlanetHandler{

    @Override
    public void hadleRequest(PlanetEnum planet) {
	
	if (planet == PlanetEnum.MERCURY) {
	    System.out.println("MercuryHandler handles the " + planet);
	}
	else {
	    System.out.println("MercuryHandler cannot handle " + planet + " request.");
	    PlanetHandler succ = this.getSuccessor();
	    if (succ != null) {
		succ.hadleRequest(planet);
	    }
	}
	
    }

}
