package inheritance;

public abstract class Account {
	int accno;
	String name;
	protected double balance;
	
	
	public Account() {
		this.accno = 0;
		this.balance = 0;
		this.name = "empty";
	}
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.balance = balance;
		this.name = name;
	}
	
	
	public abstract void withdraw(double amt);

}
