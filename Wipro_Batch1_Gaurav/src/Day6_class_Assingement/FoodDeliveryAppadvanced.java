package Day6_class_Assingement;

//Part 1:
class OrderProcessing implements Runnable {

 public void run() {
     try {
         System.out.println("Order is being processed...");
     } catch (Exception e) {
         System.out.println("Order Error: " + e.getMessage());
     }
 }
}

//Part 2:
class PaymentP implements Runnable {

 int amount;

 PaymentP(int amount) {
     this.amount = amount;
 }

 public void run() {
     try {
         if (amount <= 0) {
             throw new Exception("Invalid payment amount");
         }

         System.out.println("Payment of " + amount + " is successful");

     } catch (Exception e) {
         System.out.println("Payment Error: " + e.getMessage());
     } finally {
         System.out.println("Payment process finished");
     }
 }
}

//Part 3:

class Notifi implements Runnable {

 public void run() {
     try {
         System.out.println("Notification sent to user...");
     } catch (Exception e) {
         System.out.println("Notification Error: " + e.getMessage());
     }
 }
}

public class FoodDeliveryAppadvanced {
	 public static void main(String[] args) {

	     OrderProcessing order = new OrderProcessing();
	     PaymentP payment = new PaymentP(-100); // yaha se paymet <0 gya tab exception dhrega...
	     Notifi notify = new Notifi();

	     Thread t1 = new Thread(order);
	     Thread t2 = new Thread(payment);
	     Thread t3 = new Thread(notify);

	     t1.start();
	     t2.start();
	     //t2.join();
	     t3.start();
	 }
}
