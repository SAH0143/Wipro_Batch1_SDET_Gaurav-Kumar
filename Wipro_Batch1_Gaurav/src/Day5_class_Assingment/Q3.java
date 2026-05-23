package Day5_class_Assingment;

// 3. You are creating a security module (like encryption logic) and you want to make sure no other developer can extend and modify this class.

// Question: How will you use the final keyword to restrict inheritance? Write a Java example.

// Idea : 1. Create class ---> SecurityMdule
//		  2. Adding keyword final
//		  3. Write method ---> encryption logic
// 		  4. Try extending not allowed


final class SecurityModule{
	public void encryptData(String data) {
		System.out.println("Password Secure here :" + data);
	}
}

//eg.

//class tryToload extends SecurityModule{
//	System.out.println("this is not possible");
//}

public class Q3 {
	public static void main(String[] args) {
		
		   SecurityModule sm = new SecurityModule();
	        sm.encryptData(" Australia@0007");
	}
}
