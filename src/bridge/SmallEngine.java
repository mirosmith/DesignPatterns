package bridge;

public class SmallEngine implements Engine {

    private int horsePower = 70;  

    @Override
    public int go() {	
	
	return horsePower;
    }

}
