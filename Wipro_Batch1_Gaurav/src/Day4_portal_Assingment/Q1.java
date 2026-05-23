
//1. Moveable Shapes Simulation


package Day4_portal_Assingment;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {

    int x, y;
    int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}

class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle Center: " + center + " Radius: " + radius;
    }
}


class MovableRectangle implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {

        
        if(topLeft.xSpeed == bottomRight.xSpeed &&
           topLeft.ySpeed == bottomRight.ySpeed) {

            this.topLeft = topLeft;
            
            this.bottomRight = bottomRight;
        } else {
            System.out.println("Speed mismatch! Rectangle cannot move.");
        }
    }

    public void moveUp() {
        topLeft.moveUp();
        
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft + 
               " BottomRight: " + bottomRight;
    }
}
public class Q1 {
	public static void main(String[] args) {
		
		 MovablePoint p = new MovablePoint(0, 0, 2, 3);
	        System.out.println(p);
	        p.moveUp();
	        p.moveRight();
	        System.out.println(p);

	        MovableCircle c = new MovableCircle(5, new MovablePoint(1,1,1,1));
	        System.out.println(c);
	        c.moveDown();
	        System.out.println(c);

	        MovableRectangle r = new MovableRectangle(
	            new MovablePoint(0,0,1,1),
	            new MovablePoint(2,2,1,1)
	        );
	        System.out.println(r);
	        r.moveRight();
	        System.out.println(r);
		
	}
}
