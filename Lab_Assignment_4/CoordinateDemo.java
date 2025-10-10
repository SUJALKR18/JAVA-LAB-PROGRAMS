import coordinates.Cartesian;
import coordinates.Polar;
import java.util.Scanner;

public class CoordinateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Coordinate Conversion Menu:");
        System.out.println("1. Cartesian -> Polar");
        System.out.println("2. Polar -> Cartesian");
        System.out.println("3. Exit");
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter x: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter y: ");
                    double y = sc.nextDouble();
                    Cartesian c = new Cartesian(x, y);
                    Polar p = c.toPolar();
                    System.out.println(c);
                    System.out.println(p);
                    break;
                case 2:
                    System.out.print("Enter r: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter theta (in radians): ");
                    double theta = sc.nextDouble();
                    Polar p2 = new Polar(r, theta);
                    Cartesian c2 = p2.toCartesian();
                    System.out.println(p2);
                    System.out.println(c2);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
        sc.close();
    }
}