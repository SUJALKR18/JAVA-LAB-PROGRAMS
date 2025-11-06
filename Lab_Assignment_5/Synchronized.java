class Inventory {
    int val = 100;
    synchronized void update(int x) {
        val += x;
        System.out.println(Thread.currentThread().getName() + ": " + val);
    }
    int get() {
        return val;
    }
}
class Worker implements Runnable {
    Inventory inv;
    int x;
    Worker(Inventory inv, int x) {
        this.inv = inv;
        this.x = x;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            inv.update(x);
            try {
                Thread.sleep(100);
            } 
            catch(InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Inventory inv = new Inventory();
        Thread t1 = new Thread(new Worker(inv, 10), "T1");
        Thread t2 = new Thread(new Worker(inv, -10), "T2");
        System.out.println("Start: " + inv.get());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("End: " + inv.get());
    }
}
