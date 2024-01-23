package resize;

import com.codegym.Circle;
import com.codegym.Rectangle;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle =new Circle(3);
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Pre-resize");
        System.out.println("Radius of circle is "
                + circle.getRadius()
                + " and area is "
                + circle.getArea());
        System.out.println("Width and length of circle is "
                + rectangle.getWidth()
                + " "
                +rectangle.getLength()
                +" and area of rectangle is "
                +rectangle.getArea()
                );
        System.out.println("Enter percent of size to resize");
        double size = scanner.nextDouble();
        System.out.println("After resize");
        circle.resize(size);
        rectangle.resize(size);
        System.out.println("Pre-resize");
        System.out.println("Radius of circle is "
                + circle.getRadius()
                + " and area is "
                + circle.getArea());
        System.out.println("Width and length of circle is "
                + rectangle.getWidth()
                +" and "
                +rectangle.getLength()
                +" and area of rectangle is "
                +rectangle.getArea()
        );
        System.out.println("Enter percent of size to resize");
    }
}
