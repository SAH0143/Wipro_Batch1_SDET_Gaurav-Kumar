
// Default and Static Methods in Interfaces

package Day4_portal_Assingment;

interface Polygon{

    double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;
        for(int s : sides) {
            sum += s;
        }
        return sum;
    }

    static String shapeInfo() {
        return "This is a polygon shape.";
    }
}

class Rectangle implements Polygon {

    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }
}

class Triangle implements Polygon {

    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public double getArea() {
        return 0.5*base*height;
    }
}

public class Q2 {
	
	public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Rectangle Area: "+ r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter(5,4,5,4));

        Triangle t = new Triangle(6, 3);
        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Perimeter: " +t.getPerimeter(3,4,5));

        System.out.println(Polygon.shapeInfo());
	}
}
