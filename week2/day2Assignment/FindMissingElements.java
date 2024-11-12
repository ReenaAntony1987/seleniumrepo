package week2.day2Assignment;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElements {

	public static void main(String[] args) {
		int[] num= {1,4,3,2,8,6,7};
		
		int length=num.length;
		System.out.println("Length of the array:" +length);

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
			
		}
		
		System.out.println();
		for (int i = 0; i < num.length-1; i++) {			
			if (num[i+1]-num[i]>1) {
				System.out.println(num[i]+1);
				
			} 
		

		 {
				
			}
			
		}
			
		}
		
	}


