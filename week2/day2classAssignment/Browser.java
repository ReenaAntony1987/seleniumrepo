package week2.day2classAssignment;

public class Browser {

	public String launchbrowser(String Browsername) {
		System.out.println("Browser Launched Successfully");
		return Browsername;
			}
public void loadUrl() {
	System.out.println("Application URL loaded successfully");
	
}

public static void main(String[] args) {
	Browser mo = new Browser();
	
	String launchbrowser = mo.launchbrowser("chrome");
	System.out.println(launchbrowser);
	mo.loadUrl();
}
}


