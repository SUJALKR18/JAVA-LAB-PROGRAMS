import java.util.Scanner;
class Battery{
    double level;
    Battery(){
        level = 100;
    }
    void showLevel(){
        System.out.println("Current Battery Level : " + level);
        System.out.println("");
    }
    void sendMsg(){
        if(level >= 2){
            level -= 2;
            System.out.println("Message Sent!");
        }
        else{
            System.out.println("Insufficient Battry to perfrom the Operation!");
        }
    }
    void recvMsg(){
        if(level >= 1){
            level -= 1;
            System.out.println("Message Received!");
        }
        else{
            System.out.println("Insufficient Battry to perfrom the Operation!");
        }
    }
    void compute(){
        if(level >= 1.5){
            level -= 1.5;
            System.out.println("Computation Done!");
        }
        else{
            System.out.println("Insufficient Battry to perfrom the Operation!");
        }
    }
    void recharge(int minutes){
        double rech = minutes / 2;
        if(rech > (100 - level)){
            rech = (double)(100 - level);
        }
        level += rech;
        System.out.println("Battery Recharged!");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Battery b1 = new Battery();
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations With Command :");
        System.out.println("1. Show Level \n2. Send Message \n3. Receive Message \n4. Compute \n5. Recharge \n6. Exit");
        while (true) { 
            System.out.println("");
            System.out.print("Enter the number corresponding to operation to be performed : ");
            int ops = sc.nextInt();
            if(ops == 1){
                b1.showLevel();
            }
            else if(ops == 2){
                b1.sendMsg();
                b1.showLevel();
            }
            else if(ops == 3){
                b1.recvMsg();
                b1.showLevel();
            }
            else if(ops == 4){
                b1.compute();
                b1.showLevel();
            }
            else if(ops == 5){
                System.out.println("Enter the charging time(In Minutes) : ");
                int n = sc.nextInt();
                b1.recharge(n);
                b1.showLevel();
            }
            else if(ops == 6){
                break;
            }
        }
    }
}
