package week2.day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int[] in= {1,2,1};
		int[] out = {1,2,1};
		int length = in.length;
		int length1 = out.length;
		if (length == length1) {
			for (int i = 0; i < in.length; i++) {
				
				for (int j = out.length-1; j >=0; j--) {
					
					if (in[i]==out[j]) {
						System.out.println("Given input is a Palindrome");
						
					} else {
						System.out.println("Given input is not a palindrome");

					}
					
				}
			}
			
			
		} else {
			System.out.println( "its not a palindrome");

		}
		
		
		

	}

}
