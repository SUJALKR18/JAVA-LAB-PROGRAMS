import java.util.Scanner;
class Time {
    private int hour, min, sec;
    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    Time(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }
    void displayTime() {
        System.out.print("Time : ");
        if(hour < 10){
            System.out.print("0");
        }
        System.out.print(hour + ":");
        if(min < 10){
            System.out.print("0");
        }
        System.out.print(min + ":");
        if(sec < 10){
            System.out.print("0");
        }
        System.out.println(sec);
    }
    void setTime(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }
    Time addTime(Time t1, Time t2) {
        int c1 = 0;
        int c2 = 0;
        int s = t1.sec + t2.sec;
        if (s >= 60) {
            c1++;
            s = (s % 60);
        }
        int m = t1.min + t2.min + c1;
        if (m >= 60) {
            c2++;
            m = (m % 60);
        }
        int h = t1.hour + t2.hour + c2;
        h = h % 24;
        return new Time(h, m, s);
    }
    Time subtractTime(Time t1, Time t2) {
        int s = t1.sec - t2.sec;
        int m = t1.min - t2.min;
        int h = t1.hour - t2.hour;
        if (s < 0) {
            s += 60;
            m--;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        if (h < 0) {
            h += 24;
        }
        return new Time(h, m, s);
    }
    int toSeconds() {
        return (this.hour * 60 * 60 + this.min * 60 + this.sec);
    }
    double toHours() {
        return (((double)(this.hour)) + (((double)(this.min)) / 60) + (((double)(this.sec)) / (60 * 60)));
    }
}
public class Q1 {
    public static void main(String[] args) {
        Time t1 = new Time(5, 20, 15);
        Time t2 = new Time(3, 45, 30);
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations With Command :");
        System.out.println("1. Display Time \n2. Set Time \n3. Add Time \n4. Subtract Time \n5. Convert to Seconds \n6. Convert to Hours \n7. Exit");
        while (true) { 
            System.out.println("");
            System.out.print("Enter the number corresponding to operation to be performed : ");
            int ops = sc.nextInt();
            if(ops == 1){
                System.out.println("Timings Are : ");
                t1.displayTime();
                t2.displayTime();
            }
            else if(ops == 2){
                System.out.println("Enter the hour, minutes and seconds : ");
                int hr = sc.nextInt();
                int m = sc.nextInt();
                int s = sc.nextInt();
                t1.setTime(hr, m, s);
                System.out.println("Updated Time : ");
                t1.displayTime();
            }
            else if(ops == 3){
                Time t3 = t1.addTime(t1, t2);
                System.out.println("New Time : ");
                t3.displayTime();
            }
            else if(ops == 4){
                Time t4 = t1.subtractTime(t1, t2);
                System.out.println("New Time : ");
                t4.displayTime();
            }
            else if(ops == 5){
                System.out.println("In Seconds : " + t1.toSeconds() + " Seconds");
            }
            else if(ops == 6){
                System.out.println("In Hours : " + t1.toHours() + " Hours"); 
            }
            else if(ops == 7){
                break;
            }
        }
    }
}
