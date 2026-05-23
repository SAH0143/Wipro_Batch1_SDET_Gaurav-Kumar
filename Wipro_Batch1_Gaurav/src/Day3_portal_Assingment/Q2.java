
// 2. Remove duplicate elements from an array.

package Day3_portal_Assingment;

//import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
	       int[] arr = {1, 2, 2, 3, 4, 4, 5};

	        for(int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            for(int j = 0; j < i; j++) {
	                if(arr[i] == arr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if(!isDuplicate) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	}
	
}
