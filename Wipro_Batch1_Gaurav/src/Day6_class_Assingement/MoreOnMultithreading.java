package Day6_class_Assingement;

class DeliveryStatus {

	synchronized void updateStatus(String taskName) {

		System.out.println(taskName + " started");

		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			System.out.println(taskName + " interrupted");
		}

		System.out.println(taskName + " completed");
	}
}

class FoodDelivery extends Thread {

	DeliveryStatus status; 

	public FoodDelivery(String name, DeliveryStatus status) {
		setName(name);
		this.status = status;
	}

	public void run() {
		status.updateStatus(getName());
	}
}

public class MoreOnMultithreading {
	public static void main(String[] args) throws InterruptedException {
		
				DeliveryStatus status = new DeliveryStatus();

				FoodDelivery order = new FoodDelivery("Order Processing", status);
				FoodDelivery kitchen = new FoodDelivery("Kitchen Preparing", status);
				FoodDelivery delivery = new FoodDelivery("Delivery Task", status);

				order.setPriority(Thread.MAX_PRIORITY);
				kitchen.setPriority(Thread.NORM_PRIORITY);
				delivery.setPriority(Thread.MIN_PRIORITY);

				order.start();
				kitchen.start();

				System.out.println("Is order Alive? " + order.isAlive());

				order.join();
				kitchen.join();

				delivery.start();
				delivery.join();

				System.out.println("Pls rate our Service 😊");
	}
}
