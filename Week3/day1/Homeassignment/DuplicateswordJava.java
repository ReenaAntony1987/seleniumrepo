package Week3.day1.Homeassignment;

public class DuplicateswordJava {
	
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		
			
		
		
		// Split the string into words
        String[] words = text.split(" ");
        
        
        
        for(int i=0;i<words.length-1;i++) {
        	
        	for(int j=0; j<words.length;j++) {
        	
        if(words[i]==words[j]) {
        		System.out.print("");
        }
        		else {
        			String unmatch= words[j];
        			System.out.print(unmatch);
        		}
        		
        	}
        	
			

        }
        
		
		
	}
}


