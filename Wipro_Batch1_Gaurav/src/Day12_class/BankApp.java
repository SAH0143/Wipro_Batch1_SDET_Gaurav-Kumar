package Day12_class;
import java.io.*;

// Banking Application : How will you use Java IO File Handling to store customer transaction history and read account details from files?

public class BankApp {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("transactions.txt", true);

            fw.write("AccNo:555 || Deposit:11111000\n");
            fw.write("AccNo:555 || Withdraw:165659\n");  

            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("transactions.txt"));

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
