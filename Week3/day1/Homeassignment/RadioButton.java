package Week3.day1.Homeassignment;

public class RadioButton extends Button {
	
	public void SelectRadioButton() {
		
		System.out.println("Click the Radio Button");
	}

	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		
		 rb.click();
		 rb.setText(null);
		 rb.Submit();
		 rb.SelectRadioButton();
		
		
	}
}
