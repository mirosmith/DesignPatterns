package iterator;

public class MyRepository implements Container {
    
    private int[] sequence = {10,18,6,40,15,32,18};
    
    public Iterator getIterator() {
	return new UsualIterator();
    }
    
    private class UsualIterator implements Iterator {

	private int index;
	
	@Override
	public boolean hasNext() {
	    
	    if (index < sequence.length) {
		return true;
	    }
	    
	    return false;
	}

	@Override
	public Object next() {
	    
	    if (hasNext()) {
		return sequence[index++];
	    }	    
	   
	    return null;
	}	
	
	
    }

}
