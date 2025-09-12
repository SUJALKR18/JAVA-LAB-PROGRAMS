import java.util.Scanner;

class MyByte {
    byte data;

    MyByte(){
        data = 0;
    }

    MyByte(byte data){
        this.data = data;
    }

    void andOp(MyByte b1){
        byte ans = ((byte)(b1.data & this.data));
        System.out.println("Result : " + ans);
    }

    void orOp(MyByte b1){
        byte ans = ((byte)(b1.data | this.data));
        System.out.println("Result : " + ans);
    }

    void xorOp(MyByte b1){
        byte ans = ((byte)(b1.data ^ this.data));
        System.out.println("Result : " + ans);
    }
    void mask(byte b){
        data = ((byte)(b & this.data));
        System.out.println("Result : " + data);
    }

    void complement(){
        data = ((byte)(~(this.data)));
        System.out.println("Result : " + data);
    }
}
public class Q4 {
    public static void main(String[] args) {
        MyByte b1 = new MyByte();
        MyByte b2 = new MyByte();
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations With Command :");
        System.out.println("1. Set Object1 \n2. Set Object2 \n3. And Operation \n4. Or Operation \n5. Xor Operation \n6. Masking \n7. Complement \n8.Exit");
        while (true) { 
            System.out.println("");
            System.out.print("Enter the number corresponding to operation to be performed : ");
            int ops = sc.nextInt();
            if(ops == 1){
                System.out.print("Enter the data : ");
                byte n = sc.nextByte();
                b1 = new MyByte(n);
            }
            else if(ops == 2){
                System.out.print("Enter the data : ");
                byte n = sc.nextByte();
                b2 = new MyByte(n);
            }
            else if(ops == 3){
                b1.andOp(b2);
            }
            else if(ops == 4){
                b1.orOp(b2);
            }
            else if(ops == 5){
                b1.xorOp(b2);
            }
            else if(ops == 6){
                System.out.print("Enter a number for masking : ");
                byte n = sc.nextByte();
                b1.mask(n);
            }
            else if(ops == 7){
                b2.complement();
            }
            else if(ops == 8){
                break;
            }
        }
    }
}
