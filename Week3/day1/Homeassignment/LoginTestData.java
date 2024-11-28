package Week3.day1.Homeassignment;

public class LoginTestData extends TestData {

	
	public void enterusername() {
		System.out.println("Reena");
		
	}
	public void enterpassword() {
		System.out.println("Reenajosephine");
	}
	
	public static void main(String[] args) {
		LoginTestData lt = new LoginTestData();
		lt.enterusername();
		lt.enterpassword();
		lt.entercredential();
		lt.navigatetohomepage();
		
	}
}
