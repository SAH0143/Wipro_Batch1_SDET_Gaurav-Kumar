package April_C;

public class Employee_Salary_Calculator {
public static void main(String[] args) {
	
	double s_p_m = 55000;
	double basic_salary = s_p_m * 12;
	
	int bonus = 60000;
	
	int tax = 33000;
	
	double net_salary =  basic_salary + bonus - tax;
	
	System.out.println("Net Salary is : "+net_salary);
	
}
}
