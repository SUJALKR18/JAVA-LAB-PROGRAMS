import java.util.*;
class String_splitting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = -1;
        String ans = "";
        String arr[] = new String[100];
        int j = 0;
        System.out.print("Enter a String : ");
        String str = sc.next();
        System.out.print("Enter a separator : ");
        String sep1 = sc.next();
        char sep = sep1.charAt(0);
        for (int i = 0; i < str.length() ; i++){
            if((str.charAt(i)) == sep){
                end = i;
                ans = str.substring(start , end);
                arr[j] = ans;
                j++; 
                start = i + 1;
            }
        }
        arr[j] = str.substring(start , str.length());
        for(int i = 0; i <= j ; i++){
                System.out.print(arr[i] +  " , ");
        }
    }
}
