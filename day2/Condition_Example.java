package week.day2;

public class Condition_Example {



	/*
	 * class room:1 create class int mark=75; if(mark==35) Grade e else if(mark>=50)
	 * grade d else if(makl>65) grade c else if(mark>=75) grade b else grade a
	 */


	public static void main(String[] args) {

		int mark=75;

		if(mark==35) {
			System.out.println("Grade is E");

		}

		else if (mark>50){

			System.out.println("Grade is D");
		}
		else if (mark>=65){

			System.out.println("Grade is C");
		}
		else if (mark>=75){

			System.out.println("Grade is B");
		}

		else {

			System.out.println("Grade is A");

		}


	}
}




