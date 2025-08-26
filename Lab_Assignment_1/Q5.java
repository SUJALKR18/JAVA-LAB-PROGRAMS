import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the x and y coordinates of center : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter the radius : ");
        int r = sc.nextInt();

        System.out.print("Enter the x and y cooridnates of the point : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double dis = Math.sqrt(((y2 - y1) * (y2 - y1)) + ((x2 - x1) * (x2 - x1)));

        if(dis < r){
            System.out.println("Point lies inside the circle.");
        }
        else if(dis == r){
            System.out.println("Point lies on the boundary of the circle.");
        }
        else if(dis > r){
            System.out.println("Point lies outside the circle.");
        }
    }
}
