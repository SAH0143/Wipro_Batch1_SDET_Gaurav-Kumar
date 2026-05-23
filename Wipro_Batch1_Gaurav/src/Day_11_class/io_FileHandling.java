package Day_11_class;
import java.io.File;
import java.io.IOException;


public class io_FileHandling {
	 public static void main(String[] args)
	    {

	        try {
	            File Obj = new File("GauravF.txt");
	            
	          	// Creating File
	          	if (Obj.createNewFile()) {
	                System.out.println("File created: " + Obj.getName());
	            }
	            else {
	                System.out.println("File already exists.");
	            }
	        }
	      
	      	
	        catch (IOException e) {
	            System.out.println("Error occurred.");
	            e.printStackTrace();
	        }
	    }
}