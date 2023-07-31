package week3.day1.assignment;

class BankInfo{
	
	public void saving() {
		System.out.println("Saving account");
	}
	
	public void fixed() {
		System.out.println("Fixed account");
	}
	
	public void deposit() {
		System.out.println("Deposit account");
	}
}
class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Deposit account is changed to Axis Bank");
		
	}
}



public class BankDetails extends AxisBank {

	public static void main(String[] args) {
		
		BankDetails obj=new BankDetails();
		//method Overridded
		obj.deposit();
		
	}
	
}

