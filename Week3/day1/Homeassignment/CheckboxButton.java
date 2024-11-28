package Week3.day1.Homeassignment;

public class CheckboxButton extends Button {
	
	public void clickcheckbutton() {
		System.out.println("Click the check button");
	}

	public static void main(String[] args) {
		
		CheckboxButton cb = new CheckboxButton();
		
		 cb.click();
		 cb.setText(null);
		 cb.Submit();
		 cb.clickcheckbutton();
	}
}
