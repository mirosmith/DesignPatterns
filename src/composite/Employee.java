package composite;

public class Employee implements Component {
    
    private String name;
    private String address;
    private int age;
    
    public Employee(String name, String address, int age) {	
	this.name = name;
	this.address = address;
	this.age = age;
    }    

    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public void sayHello() {
	
	System.out.println("Employee " + name + " says hello.");
	
    }

    @Override
    public void sayGoodBye() {
	
	System.out.println("Employee " + name + " says goodbye.");
	
    }

    @Override
    public void print() {
	
	System.out.println("Employee [name=" + name + ", address=" + address + ", age=" + age + "]");
    }    
    

}
