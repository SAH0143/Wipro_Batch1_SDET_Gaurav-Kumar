package Day6_portal_Assingement;

// 3.Check if character is a Digit


public class Q3 {

    public static void main(String[] args) {

        char ch = '7';

        if(Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        }

        else {
            System.out.println(ch + " is not a Digit");
        }
    }
}