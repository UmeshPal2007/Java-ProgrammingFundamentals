//Circle Calculator
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + Math.round(circumference * 100.0) / 100.0);
        System.out.println("Area: " + Math.round(area * 100.0) / 100.0);

        scanner.close();
    }
}