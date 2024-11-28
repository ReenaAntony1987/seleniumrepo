package Week3.day1.Homeassignment;

public class APIClient {
	
	public void SendRequest(String endpoint) {
		System.out.println("endpoint level:"+ endpoint);
	}
	
	public void SendRequest(String endpoint,String requestbody,Boolean requeststatus) {
		System.out.println("endpoint level:"+ endpoint +"\n"+"request asked:"+requestbody+"\n"+"Permission granted:"+requeststatus);
	}
	
	public static void main(String[] args) {
		
		APIClient ac = new APIClient();
		ac.SendRequest("High");
		ac.SendRequest("Low", "Please",false);
		
	}

}
