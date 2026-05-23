
// Q1. Sort an array in ascending and descending order.

package Day3_portal_Assingment; 

//import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 7};
		for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		System.out.print("Ascending: ");
        for(int num : arr) System.out.print(num + " ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Descending: ");
        for(int num : arr) System.out.print(num + " ");
	}
	
}
