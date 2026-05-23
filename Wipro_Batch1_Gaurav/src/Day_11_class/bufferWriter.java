package Day_11_class;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter {
	public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("GauravB.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("hii everyone");
            bw.newLine();
            bw.write("\nBufferedWrit example");
            bw.write("\nthis file is read by readFile 😁😁😁");

            bw.close();

            System.out.println("Data written successfully");
        }

        catch(IOException e) {

            System.out.println("Error : " + e.getMessage());
        }
    }
}
