package Day11_class;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {


public static void main(String[] args)
	{
 
		try {
			FileReader reader = new FileReader("GauravB.txt");
            Scanner read = new Scanner(reader);
            
            while(read.hasNextLine()){
            	
            	String data = read.nextLine();
            	System.out.println(data);
            }
			read.close();
			}
 
		 	catch(FileNotFoundException e)
            {
            	System.out.println("error");
            	e.printStackTrace();
            }
	}
}
 