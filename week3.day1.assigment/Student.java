package week3.day1.assignment;

public class Student {

	
	public void getStudentInfo(int id) {
		
		System.out.println("id :"+ id);
		
	}
	
   public void getStudentInfo(int id, String name) {
		
	   System.out.println("id :"+id +" "+"Name :"+ name);
	}

    public void getStudentInfo(Double phoneNumber, String email) {
    	
    	System.out.println(phoneNumber + email);
    	
	
}
    public static void main(String[] args) {
		
    	Student obj =new Student();
    	obj.getStudentInfo(5001);
    	obj.getStudentInfo(23, "Magesh");
    	obj.getStudentInfo(9875553666d, "Testleaf@gmail.com");
	}
	
	
}
