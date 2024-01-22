import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side 1: ");
        double a = scanner.nextDouble();
        System.out.println("Enter length of side 2: ");
        double b = scanner.nextDouble();
        System.out.println("Enter length of side 3: ");
        double c = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter colour of triangle: ");
        String d = scanner.nextLine();
        Triangle triangle = new Triangle( a,  b,  c, d);
        System.out.println(triangle);
    }
}
