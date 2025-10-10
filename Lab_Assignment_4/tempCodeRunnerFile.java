import geoshapes.Circle;
import geoshapes.Rectangle;
import geoshapes.Sphere;
import geoshapes.Triangle;
import java.util.Scanner;

public class GeoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Geoshapes Menu:");
        System.out.println("1. Circle (area & perimeter)");
        System.out.println("2. Rectangle (area & perimeter)");
        System.out.println("3. Triangle (area & perimeter)");
        System.out.println("4. Sphere (surface area & volume)");
        System.out.println("5. Exit");
        do {
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println(c);
                    System.out.println("Area: " + c.area());
                    System.out.println("Perimeter: " + c.perimeter());
                    break;
                case 2:
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    Rectangle rect = new Rectangle(w, h);
                    System.out.println(rect);
                    System.out.println("Area: " + rect.area());
                    System.out.println("Perimeter: " + rect.perimeter());
                    break;
                case 3:
                    System.out.print("Enter side a: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter side b: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter side c: ");
                    double c3 = sc.nextDouble();
                    Triangle t = new Triangle(a, b, c3);
                    System.out.println(t);
                    System.out.println("Perimeter: " + t.perimeter());
                    System.out.println("Area: " + t.area());
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double rs = sc.nextDouble();
                    Sphere s = new Sphere(rs);
                    System.out.println(s);
                    System.out.println("Surface area: " + s.surfaceArea());
                    System.out.println("Volume: " + s.volume());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 5);
        sc.close();
    }
}