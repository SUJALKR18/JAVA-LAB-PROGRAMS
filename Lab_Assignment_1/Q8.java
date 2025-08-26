import java.util.Scanner;
public class Q8 {
    public static double factorial(int n){
        if(n == 0 || n == 1)return 1;
        return n * factorial(n - 1);
    }

    public static double euler(int n){
        if(n == 0)return 1;
        else return (1 / factorial(n)) + euler(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        double val = euler(n);
        System.out.println("The value of e is : " + val);
    }
}

