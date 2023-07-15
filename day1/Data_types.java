package week1.day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name="Magesh";
		char Initial='V';
		Float Weight=78.5f;
		long AccountNum=345678907433l;
		boolean TL_User=true;
		
		System.out.println("FirstName is " + Name);
		System.out.println("SecondName is " +Initial);
		System.out.println("Weight is " + Weight);
		System.out.println("AcctNum is " + AccountNum);
		System.out.println("TestLeaf_User " + TL_User);
		
		
		System.out.println();
		
		//To print the output at single print
		System.out.println(Name +"\n"+ Initial+"\n"+Weight+"\n"+AccountNum+"\n"+TL_User+"\n");
		

	}

}
