package inheritance;

public class EmpDemo {
	
	public static void main(String []args) {
		

		
		Emp e1 = new SalesManager("Heema",1942,1,1000,50,2000);
		Emp e2 = new Programmer("Sachin",1945,2,2000,6,245);
		Emp e3 = new Admin("Pranav",1999,3,3000,300);
		
		e1.calSalary();
		e2.calSalary();
		e3.calSalary();
		
		System.out.println(e1.salary);
		

		
		
	}

}