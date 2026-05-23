package Day6_portal_Assingement;

//2.Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. Show that the original object is modified.

class Box {

    int length;

    Box(int length) {
        this.length = length;
    }
}

public class Q2 {

    static void changeBox(Box b) {

        b.length = 100;

        System.out.println("Inside Method Length : " + b.length);
    }

    public static void main(String[] args) {

        Box b1 = new Box(20);

        System.out.println("Before Method Call : " + b1.length);

        changeBox(b1);

        System.out.println("After Method Call : " + b1.length);
    }
}