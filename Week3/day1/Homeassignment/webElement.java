package Week3.day1.Homeassignment;

public class webElement {
	public void click() {
		System.out.println("Click the Browser");
	}
	
	public void setText(String text) {
		System.out.println("Display the setText");
	}
	
	public static void main(String[] args) {
		
		webElement we = new webElement();
		
		we.click();
		we.setText(null);
		
	}

}
