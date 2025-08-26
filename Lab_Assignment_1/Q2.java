import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number(in metres) : ");
        double m1 = sc.nextDouble();
        System.out.println("In feet : "  + m1 * 0.3048);

        System.out.print("Enter a number(in Minutes) : ");
        double y1 = sc.nextDouble();
        System.out.println("In Days : "  + (y1 / (24 * 60)));
        System.out.println("In Years : "  + (y1 / (24 * 60 * 365)));       
    }   
}
