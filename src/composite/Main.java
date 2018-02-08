package composite;

public class Main {

    public static void main(String[] args) {
	
	Component adrian = new Employee("Adrian", "Los Angeles", 22);
	Component leona = new Employee("Leona", "Prague", 32);
	Component simir = new Employee("Simir", "Tokio", 64);
	Component julio = new Employee("Julio", "Madrid", 10);
	
	Composite ceo = new Composite("Alejandro, CEO");
	
	Composite headSales = new Composite("Andrew, head-sales");
	
	Composite headMarketing = new Composite("Andrew, head-marketing");
	
	ceo.addEmployee(julio);
	ceo.addEmployee(headMarketing);
	ceo.addEmployee(headSales);	
	
	headSales.addEmployee(adrian);
	headSales.addEmployee(leona);
	
	headMarketing.addEmployee(simir);
	headMarketing.addEmployee(julio);

	ceo.printSubEmployees();
	System.out.println();
	headSales.printSubEmployees();
	System.out.println();
	headMarketing.printSubEmployees();
	

    }

}
