package Day2_class_Assingment;

public class looping_statement_Q3 {
	
	public static void main(String[] args) {
		int n =3;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
}
		
	
