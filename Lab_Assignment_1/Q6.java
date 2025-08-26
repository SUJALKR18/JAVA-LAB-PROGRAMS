
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
    
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];

        System.out.print("Enter the first vector : ");
        for(int i = 0; i < n ; i++){
            vec1[i] = sc.nextInt();
        }

        System.out.print("Enter the second vector : ");
        for(int i = 0; i < n ; i++){
            vec2[i] = sc.nextInt();
        }

        int dot_product = 0;

        int i = 0;
        for(int vec : vec1){
            dot_product += vec * vec2[i];
            i++;
        }

        System.out.println("The dot product of two vectors is : " + dot_product);
    }    
}
