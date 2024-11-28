package Week3.day1.Homeassignment;

public class Button extends webElement {
	
	public void Submit() {
		System.out.println("click on the Button");
	}
	
	
	public static void main(String[] args) {
		 Button bu = new Button();
		 bu.click();
		 bu.setText(null);
		 bu.Submit();
	}

}
