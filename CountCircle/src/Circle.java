public class Circle {
    public static int counter = 0;
    private int id = 0;
    private double radius;
    public static double maxRadius = 0;
    public final double pi = 3.14;
    public static double sumArea = 0;

    Circle(int id, double radius) {
        if (this.radius > maxRadius) {
            maxRadius = this.radius;
        }
        counter++;
        this.id = id;
        this.radius = radius;
        sumArea += getArea();
    }

    Circle() {
        if (this.radius > maxRadius) {
            maxRadius = this.radius;
        }
        counter++;
        sumArea = getArea();
    }
    public double getMaxRadius(){
        return maxRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * pi;
    }

    public double getPerimeter() {
        return 2 * getRadius() * pi;
    }

    @Override
    public String toString() {
        return "Cirlce class has "
                +counter
                +" cirle object"
                +" the greatest radius of Objects is "
                + getRadius()
                + ". Sum of all object Area is "
                + sumArea;
    }
}
