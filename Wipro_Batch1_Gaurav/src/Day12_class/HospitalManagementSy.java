package Day12_class;
import java.io.*;

// Q.3 Hospital Management System : How will you implement Java IO classes to maintain patient records and generate medical reports?

public class HospitalManagementSy {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("patients.txt", true);

            fw.write("ID:3536 Name:Raju Age:11 Disease:Fever\n");
            fw.write("ID:0420 Name:Kaliya Age:23 Disease:Psycho\n");
            fw.write("ID:1011 Name:Bhim Age:20 Disease:Feet\n");
            fw.write("ID:2535 Name:Chutki Age:18 Disease: Weak\n");

            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
            String data;
            while((data = br.readLine()) != null) {
                System.out.println(data);
            }

            br.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
