import java.util.Scanner;

public class String_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str = sc.next();
        int len = str.length();
        System.out.print("ENTER LENGTH TO BE ROTATED ON THE LEFT : ");
        int l = sc.nextInt();
        l = l % len;  
        String s1 = str.substring(l);
        String s2 = str.substring(0, l);
        System.out.println("Left rotation by " + l + " -> " + s1 + s2);

        System.out.print("ENTER LENGTH TO BE ROTATED ON THE RIGHT : ");
        int r = sc.nextInt();
        r = r % len;  
        s1 = str.substring(len - r);
        s2 = str.substring(0, len - r);
        System.out.println("Right rotation by " + r + " -> " + s1 + s2);

    }
}
