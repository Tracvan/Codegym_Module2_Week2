public class Test {
    public static void main(String[] args) {
        Point point = new Point(5,10);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(3,5,2,2);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
