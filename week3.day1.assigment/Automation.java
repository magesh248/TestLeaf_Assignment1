package week3.day1.assignment;

public class Automation extends Multiple_Language  {
	
	public void selenium() {
		System.out.println("selenium is uses as tool");
		
	}

	public void java() {
		System.out.println("java language is used");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby language is used");
		
	}

	public static void main(String[] args) {
		
		Automation obj =new Automation();
		obj.python();
		obj.ruby();
		obj.selenium();
		obj.java();
		
	}

	

}
