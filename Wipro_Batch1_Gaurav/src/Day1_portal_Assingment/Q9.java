
// 9. Find grade based on marks (if-else-if ladder)

package Day1_portal_Assingment;

public class Q9 {
		public static void main(String[] args) {
			int marksOfdsa=9;
			int marksOfsql=8;
			int marksOfoops=8;
			int  marksOfml= 7;
			
			int Avg_marks;
			
			Avg_marks = ( marksOfdsa+marksOfsql+marksOfoops+marksOfml)/4;
			
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
