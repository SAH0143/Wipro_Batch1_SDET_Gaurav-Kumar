package Day2_class_Assingment;

//. User Login Validation System: Validate user name and password. Display success or failure message.


public class Decision_Making_Statement_Q2 {

	public static void main(String[] args) {
		
		String User_name = "Gaurav Kumar";
		int Password = 9876;
		
		if(User_name.equals("Gaurav Kumar") && Password == 9876) {
			System.out.println("You login Successfully");
			
		}
		
		else {
			System.out.println("Wrong user name or password");
		}
		
	}
	
}
