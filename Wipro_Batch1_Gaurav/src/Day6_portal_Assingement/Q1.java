package Day6_portal_Assingement;

//1.Write a program where a method accepts an integer parameter and tries to change its value. Print the value before and after the method call.

public class Q1 {

    static void changeValue(int num) {
        num = 50;

        System.out.println("Inside Method : " + num);
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Before Method Call : " + number);

        changeValue(number);

        System.out.println("After Method Call : " + number);
    }
}