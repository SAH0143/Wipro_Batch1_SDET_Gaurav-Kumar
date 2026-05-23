package Day12_class;
import java.io.*;
// Q.4 Food Delivery Application : How can Java File Handling help in storing restaurant menus, customer orders, and delivery logs?

public class FoodDeliveryApp {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("food.txt", true));

            bw.write("Menu: Burger - 120");
            bw.newLine();

            bw.write("Order: Burger x2");
            bw.newLine();

            bw.write("Delivery: Delivered to Kaliya");
            bw.newLine();

            bw.close();

            System.out.println("Food data stored");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}