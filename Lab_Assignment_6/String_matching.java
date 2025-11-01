import  java.util.*;
public class String_matching{
    public static int match(String str1,String str2,int index,int k) {
        int x = -1;
        int length = 0;
        int idx = index;
        for(int i=0;i<str2.length();i++){
            if(str1.charAt(index)==str2.charAt(i)){
                index++;
                length++;
                if(length>=k){
                    return i-length+1;
                }
                if(index>=str1.length()) return x;
            }
            else{
                length=0;
                index = idx;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); 
        String str2 = sc.next();
        int k = sc.nextInt();
         for(int i=0;i<str1.length();i++){
            int x = match(str1, str2, i, k);
            if(x!=-1){
                System.out.println("True "+i+" "+x);
                return;
            }
         }
         System.out.println("False");
    }
}