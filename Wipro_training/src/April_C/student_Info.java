package April_C;

// To create a program to store and display student  details.

public class student_Info {
	public static void main(String[] args) {
		
	String Name = "Gaurav Kumar";
	int age = 21;
	int marksOfdsa=9;
	int marksOfsql=8;
	int marksOfoops=8;
	int  marksOfml= 7;
	
	int Avg_marks;
	
	Avg_marks = ( marksOfdsa+marksOfsql+marksOfoops+marksOfml)/4;
	
	
	
	System.out.println("Name is :"+Name);
	System.out.println("Age is :"+age);
	System.out.println("Marks of Dsa is :"+marksOfdsa);
	System.out.println("Marks of SQL is :"+marksOfsql);
	System.out.println("Marks of Ml is :"+marksOfml);
	System.out.println("Marks of OOPS is :"+marksOfoops);
	System.out.println("Average Marks is :"+Avg_marks);
	
	if(Avg_marks>9 && Avg_marks<10)
		System.out.println("Grade : A");
	
	else if(Avg_marks>7 && Avg_marks<9)
		System.out.println("Grade : B");
	
	else if(Avg_marks>5 && Avg_marks<7)
		System.out.println("Grade : C");
	
		else
	System.out.println("Grade : F");
		
	
	}
}
