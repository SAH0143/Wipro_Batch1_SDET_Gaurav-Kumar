package Day2_class_Assingment;

//Online Shopping Discount System: Create a program where a user gets a discount based on purchase amount.

public class Decision_Making_Statement_Q1 {
	
	public static void main(String[] args) {
		
		int amount = 45000;
		int price;
		
		if(amount>0 && amount <5000) {
			int dis = 5;
			int discount = (amount *dis)/100;
			price = amount - discount;
			System.out.println(" Total Price, Final price and discount you get is : "+amount+" "+price+" "+discount);
			
		}
		
		else if(amount>=5000 && amount <=10000) {
			int dis = 10;
			int discount = (amount *dis)/100;
			price = amount - discount;
			System.out.println(" Total Price, Final price and discount you get is : "+amount+" "+price+" "+discount);
		}
		
		else if(amount>10000 && amount<=20000) {
			int dis = 25;
			int discount = (amount *dis)/100;
			price = amount - discount;
			System.out.println(" Total Price, Final price and discount you get is : "+amount+" "+price+" "+discount);
		}
		
		else if(amount>20000 && amount<=50000) {
			int dis = 35;
			int discount = (amount *dis)/100;
			price = amount - discount;
			System.out.println(" Total Price, Final price and discount you get is : "+amount+" "+price+" "+discount);
		}
		
		else {
			
			System.out.println("Invalid");
		}
		
	}
}
