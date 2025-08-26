import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("X ");
        for(int i = 0; i < n ; i++){
            System.out.print(i + " ");
        }

        System.out.println("");

        for(int i = 0; i < n ; i++){
            System.out.print(i + " ");
            for(int j  = 0 ; j  < n ; j++){
                System.out.print(((i * j) % n) + " "); 
            }
            System.out.println("");
        }

    }
}
