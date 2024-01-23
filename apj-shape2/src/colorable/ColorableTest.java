package colorable;

import com.codegym.Circle;
import com.codegym.Rectangle;
import com.codegym.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(3,"blue", false);
        Rectangle rectangle = new Rectangle(5,10,"red",true);
        shapes[0] = rectangle;
        shapes[1] = circle;
        for(Shape shape : shapes){
            if(shape instanceof Circle) {
                System.out.println("Area " + circle.getArea());
            }
            else if(shape instanceof Rectangle){
                System.out.println("Area " + rectangle.getArea());
            }
            if(shape instanceof Colorable){
                Colorable colorableshape = (Colorable) shape;
                colorableshape.howToColor();
            }
        }


    }
}
