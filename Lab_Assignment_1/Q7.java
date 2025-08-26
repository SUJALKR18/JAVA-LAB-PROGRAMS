import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the endpoints of the first line : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter the endpoints of the second line : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double slope_1 = (y2 - y1) / (x2 - x1);
        double slope_2 = (y4 - y3) / (x4 - x3);

        if(slope_1 == slope_2){
            System.out.println("The two lines are parallel");
        }
        else{
            System.out.println("The two lines are intersecting");
        }

    }    
}
