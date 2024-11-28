package Week3.day1.Homeassignment;

public class Textfield extends webElement {
	
	public void getText() {
		System.out.println("Receive the text");
	}
	
	public static void main(String[] args) {
		
		Textfield tf = new Textfield();
		 tf.click();
		 tf.setText(null);
		 tf.getText();
		 
	}

}
