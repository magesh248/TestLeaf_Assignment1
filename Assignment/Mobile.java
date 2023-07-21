package week1.day1;

public class Mobile {

	
	public void makeCall() {
		
		System.out.println("Calling the user");
		
	}
	
public void getMsg() {
		
		System.out.println("Messaging the user");
		
	}

//mobileModel (String),mobileWeight (float)
// In second method create variable  isFullCharged (boolean),mobileCost (int)

String mobileModel="Samsung s20";
float mobileWeight =162.5f;
boolean isFullyCharged=true;
int mobileCost=50000;

public static void main(String[] args) {
	
	Mobile obj =new Mobile();
	obj.makeCall();
	obj.getMsg();
	System.out.println("This is my mobile");
	
	System.out.println("MobileModel" +obj.mobileModel);
	System.out.println("mobileWeight" +obj.mobileWeight);
	System.out.println("isFullyCharged" +obj.isFullyCharged);
	System.out.println("mobileCost" +obj.mobileCost);
	
}

}
