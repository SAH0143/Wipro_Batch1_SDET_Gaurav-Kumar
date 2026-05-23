package Day2_class_Assingment;

//Employee Salary Increment System: Write a program to update salaries of employees using a loop.


public class looping_stattement_Q1 {
	
	public static void main(String[] args) {
		
		double salary_A = 75000;
		double salary_B = 55000;
		double salary_C = 35000;
		
		for (int y =1; y<=3;y++) {
			
			salary_A = salary_A + (salary_A*10)/100;
			System.out.println("Salary of A is:"+ salary_A);
			salary_B = salary_B + (salary_B*10)/100;
			System.out.println("Salary of B is:"+ salary_B);
			salary_C = salary_C + (salary_C*10)/100;
			System.out.println("Salary of C is:"+ salary_C);
			
			System.out.println("=========================");
			
			
			
		}
		
	}
	
}
