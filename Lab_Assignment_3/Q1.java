import java.util.Scanner;
class Point{
    float xco;
    float yco;
    Point(){
        xco = 0;
        yco = 0;
        System.out.println("Point's Default Constructor is called!");
    }
    Point(float xco , float yco){
        this.yco = yco;
        this.xco = xco;
        System.out.println("Point's Parameterized Constructor is called!");
    }
    void print(){
        System.out.println("xco : " + xco +  " , yco : " + yco);
    }
}

class Circle extends Point{
    float radius;

    Circle(){
        radius = 0;
        System.out.println("Circle's Default Constructor is called!");
    }
    Circle(float radius){
        this.radius = radius;
        System.out.println("Circle's Parameterized Constructor is called!");
    }
    
    @Override
    void print(){
        System.out.println("Circle's Centre : " + xco + " , " + yco);
        System.out.println("Circle's radius : " + radius);
    }

    float area(){
        return ((float)((22 / 7) * radius * radius));
    }
    
}

class Cylinder extends Circle{
    float height;

    Cylinder(){
        height = 0;
        System.out.println("Cylinder's Default Constructor is called!");
    }

    Cylinder(float radius , float height){
        this.radius = radius;
        this.height = height;
        System.out.println("Cylinder's Parameterized Constructor is called!");
    }

    @Override

    void print(){
        System.out.println("Cylinder's Centre : " + xco + " , " + yco);
        System.out.println("Cylinder's radius : " + radius);
        System.out.println("Cylinder's height : " + height);
    }

    float surarea(){
        return ((float)(2 * Math.PI * radius * height) + (float)(2 * 3.14 * radius * radius));
    }

    float volume(){
        return (float)(Math.PI * radius * radius * height);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = null;
        while(true) {
            System.out.println("\nCylinder Operations Menu:");
            System.out.println("1. Create new Cylinder");
            System.out.println("2. Print Cylinder details");
            System.out.println("3. Calculate Surface Area");
            System.out.println("4. Calculate Volume");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    float radius = sc.nextFloat();
                    System.out.print("Enter height: ");
                    float height = sc.nextFloat();
                    cylinder = new Cylinder(radius, height);
                    System.out.println("Cylinder created successfully!");
                    break;
                    
                case 2:
                    if(cylinder != null) {
                        cylinder.print();
                    }
                    else {
                        System.out.println("Please create a cylinder first!");
                    }
                    break;
                    
                case 3:
                    if(cylinder != null) {
                        System.out.println("Surface Area: " + cylinder.surarea());
                    } 
                    else {
                        System.out.println("Please create a cylinder first!");
                    }
                    break;
                    
                case 4:
                    if(cylinder != null) {
                        System.out.println("Volume: " + cylinder.volume());
                    } 
                    else {
                        System.out.println("Please create a cylinder first!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }    
}
