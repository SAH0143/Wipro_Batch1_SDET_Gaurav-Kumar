package Day12_class;
import java.io.*;

// Q.2 E-Commerce Application : How can Java File Handling be used to save product orders, invoices, and customer shipping details?

public class E_Com {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt", true));

            bw.write("OrderID:abfgh562487 || Product:Laptop || Price:55000 || Add.- Kolkata");
            bw.newLine();

            bw.write("OrderID:achd9658gh754 || Product:Rocket || Price:200000000 || Add.- Moon");
            bw.newLine();

            bw.close();

            System.out.println("Orders saved");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}