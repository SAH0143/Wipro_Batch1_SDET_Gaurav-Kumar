package Day11_class;
import java.io.*;

class Emp implements Serializable {

    int id;
    String name;

    Emp(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

public class SerializatioN {

	public static void main(String[] args) throws Exception {

        Emp s1 = new Emp(555, "Chutki");

        FileOutputStream fos = new FileOutputStream("student.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();

        System.out.println("Object Serialization done ✅");
    }
}