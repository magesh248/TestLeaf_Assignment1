package week3.day1.assignment;

class computer{
	
	public void computer_machine() {
		
		System.out.println("student using computer in lab session");
		
	}
}

public class Desktop extends computer{
	
public void deskop_machine() {
		
		System.out.println("desktop using computer in lab session");
		
	}
	
	public static void main(String[] args) {
		
		Desktop obj =new Desktop();
		
		obj.computer_machine();
		obj.deskop_machine();
		
	}

}
