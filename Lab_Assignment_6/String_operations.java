import java.util.*;
public class String_operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String str = sc.next();
        while (true) { 
            System.out.println("ENTER : ");
            System.out.println("1 TO INSERT");
            System.out.println("2 TO REPLACE");
            System.out.println("3 TO DELETE");
            System.out.println("4 TO DISPLAY");
            System.out.println("5 TO EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.print("Enter substring to insert: ");
                String insertStr = sc.next();
                System.out.print("Enter position to insert at: ");
                int pos = sc.nextInt();
                str = str.substring(0, pos) + insertStr + str.substring(pos);
            }
            else if(ch==2){
                System.out.print("Enter substring to replace: ");
                String oldStr = sc.next();
                System.out.print("Enter new substring: ");
                String newStr = sc.next();
                str = str.replace(oldStr, newStr);
            }
            else if(ch==3){
                System.out.print("Enter substring to delete: ");
                String delStr = sc.next();
                str = str.replace(delStr, "");
            }
            else if(ch==4){
                System.out.println("Current string: " + str);
            }
            else if(ch==5){
                System.out.println("Exiting program...");
                sc.close();
                System.exit(0);
            }
            else{
                System.out.println("ENTER VALID CHOICE");
            }
        }
    }
}