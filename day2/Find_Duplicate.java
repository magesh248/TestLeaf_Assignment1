package week.day2;

import java.util.Arrays;

public class Find_Duplicate {

	public static void main(String[] args) {


		int [] nums= {2,5,7,7,5,9,2,3};

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if(nums[i]==nums[j]) {

					System.out.println("Duplicate value is: "+ nums[i]); }

			}

		}

		System.out.println("-------------------------------------------");

		int[] num = { 2, 5, 7, 7,5, 9, 2, 3 };

		Arrays.sort(num);

		for (int i = 0; i < num.length - 1; i++) {

			if (num[i] == num[i + 1])
				System.out.println("Duplicate value using arraySort: " + num[i + 1]);

		}

	}

}
