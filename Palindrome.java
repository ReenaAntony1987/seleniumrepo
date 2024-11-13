package week2.day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		String word = "1221";
		String rev = "";
		
		for (int i = word.length()-1; i >=0; i--) {
			rev=rev+word.charAt(i);
			
		}
		System.out.println(rev);
		
		if (word.equals(rev)) {
			
			System.out.println("Palindrome");
			
		} else { 
			
			System.out.println("Not a Palindrome");

		}
		

}
}