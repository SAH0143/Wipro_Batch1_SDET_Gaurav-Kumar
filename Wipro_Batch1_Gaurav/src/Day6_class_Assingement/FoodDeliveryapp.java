package Day6_class_Assingement;
//import java.lang.*;

// Food Delivery app

// Idea : Thread 1 ---> Oder Processing 
//		  Thread 2 ----> Payment Processing
//  	  Thread 3 ----> Notification Sending

// Part 1:
class OderProcessing implements Runnable{
	public void run() {
		System.out.println("Oder is being processed...");
	}
}

// Part 2:
class PaymentProcessing implements Runnable{
	public void run() {
		System.out.println("Payment is being processed...");
	}
}

// part 3:
class Notification implements Runnable{
	public void run() {
		System.out.println("Notification sent to user....");
	}
}
public class FoodDeliveryapp {
	public static void main(String[] args) {
		try {
		    OrderProcessing order = new OrderProcessing();
			PaymentProcessing payment = new PaymentProcessing();
			Notification noti = new Notification();
			
			Thread th1 = new Thread(order);
			Thread th2 = new Thread(payment);
			Thread th3 = new Thread(noti);
			
			th1.start();
			th1.join();
			th2.start();
			th3.start();
		
		
		}catch(Exception e) {
		   System.out.println("Error:" +e.getMessage());
		}finally {
		   System.out.println("Oder Completed");
		}
	}
}
