package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
 *
 */
public class Composite implements Component {
    
    private String name;
    private List<Component> subEmployees;
    
    public Composite(String name) {	
	this.name = name;
	this.subEmployees = new ArrayList<Component>();
    }

    @Override
    public void sayHello() {
	
	System.out.println("Composite " + name + " says hello.");
	
    }

    @Override
    public void sayGoodBye() {
	
	System.out.println("Composite " + name + " says goodbye.");
	
    }
    
    public void addEmployee(Component emp) {
	subEmployees.add(emp);
    }
    
    public void removeEmployee(Component emp) {
	subEmployees.remove(emp);
    }
    
    public Component getEmployee(int i) {
	return subEmployees.get(i);
    }
    
    public void printSubEmployees() {
	
	System.out.println("Sub-employees of " + name);
	
	for (Component e : subEmployees) {
	    e.print();
	}
    }    
    
    @Override
    public void print() {
	
	System.out.println("Composite [name=" + name + "]");
    }   
    

}
