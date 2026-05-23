
//3. Find largest element in each row

package Day3_portal_Assingment;

public class Q3{
	public static void main(String[] args){
		
		int[][] arr = {{1, 5, 3},{9, 2, 8},{4, 6, 7}};

	        for(int i = 0; i < arr.length; i++){
	            int max = arr[i][0];

	            for(int j = 1; j < arr[i].length; j++) {
	                if(arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }

	            System.out.println("Row "+i+ " largest element is : " + max);
	        }
		
	}
}
