package singleton;

public class MainClass {

    public static void main(String[] args) {
	
	Singleton a = Singleton.getSingleton();	
	Singleton b = Singleton.getSingleton();
	
	System.out.println("a = " + a.toString() + " " + a.hashCode());
	System.out.println("b = " + b.toString() + " " + a.hashCode());
	System.out.println("equals = " + a.equals(b));
	
	
	
    }

}
