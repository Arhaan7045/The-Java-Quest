package Day7.OOP;

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea(){
        return length * breadth;
    }
}

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.5,5);
        Rectangle r2 = new Rectangle(4, 9);

        System.out.println("Area of rectangle 1 = " + r1.calculateArea());
        System.out.println("Area of rectangle 2 = " + r2.calculateArea());
    }
}
