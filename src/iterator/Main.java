package iterator;

public class Main {

    public static void main(String[] args) {

	Container a = new MyRepository();
	
	for (Iterator it = a.getIterator(); it.hasNext();) {
	    
	    System.out.println(it.next());
	    
	}

    }

}
