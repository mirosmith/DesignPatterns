package bridge;

public class BigEngine implements Engine {
    
    private int horsePower = 240;   

    @Override
    public int go() {	
	
	return horsePower;
    }

}
