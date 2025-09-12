import java.util.Scanner;

abstract class Shape2D {
    String type;
    
    Shape2D(String type) {
        this.type = type;
    }
    
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape2D {
    Point center;
    double radius;
    
    Circle(Point center, double radius) {
        super("Circle");
        this.center = center;
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    void print() {
        System.out.println("Circle Details:");
        System.out.println("Type: " + type);
        System.out.println("Center: (" + center.x + "," + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Triangle extends Shape2D {
    double base;
    double height;
    double side1, side2; 
    Triangle(double base, double height, double side1, double side2) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
    
    @Override
    double perimeter() {
        return base + side1 + side2;
    }
    
    void print() {
        System.out.println("Triangle Details:");
        System.out.println("Type: " + type);
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
class Point {
    double x, y;    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = null;
        Triangle triangle = null;
        while(true) {
            System.out.println("\nShape Operations Menu:");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Triangle");
            System.out.println("3. Calculate Area");
            System.out.println("4. Calculate Perimeter");
            System.out.println("5. Print Shape Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter Circle Details:");
                    System.out.print("Enter center x-coordinate: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter center y-coordinate: ");
                    double y = sc.nextDouble();
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    circle = new Circle(new Point(x, y), radius);
                    System.out.println("Circle created successfully!");
                    break;
                case 2:
                    System.out.println("Enter Triangle Details:");
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.print("Enter side 1: ");
                    double side1 = sc.nextDouble();
                    System.out.print("Enter side 2: ");
                    double side2 = sc.nextDouble();
                    triangle = new Triangle(base, height, side1, side2);
                    System.out.println("Triangle created successfully!");
                    break;
                case 3:
                    System.out.println("\n1. Circle\n2. Triangle");
                    System.out.print("Choose shape type: ");
                    int type = sc.nextInt();
                    if (type == 1 && circle != null) {
                        System.out.println("Circle Area: " + circle.area());
                    } else if (type == 2 && triangle != null) {
                        System.out.println("Triangle Area: " + triangle.area());
                    } else {
                        System.out.println("Shape not created yet!");
                    }
                    break;
                case 4:
                    System.out.println("\n1. Circle\n2. Triangle");
                    System.out.print("Choose shape type: ");
                    type = sc.nextInt();
                    if (type == 1 && circle != null) {
                        System.out.println("Circle Perimeter: " + circle.perimeter());
                    } else if (type == 2 && triangle != null) {
                        System.out.println("Triangle Perimeter: " + triangle.perimeter());
                    } else {
                        System.out.println("Shape not created yet!");
                    }
                    break;
                case 5:
                    System.out.println("\n1. Circle\n2. Triangle");
                    System.out.print("Choose shape type: ");
                    type = sc.nextInt();
                    if (type == 1 && circle != null) {
                        circle.print();
                    } else if (type == 2 && triangle != null) {
                        triangle.print();
                    } else {
                        System.out.println("Shape not created yet!");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
