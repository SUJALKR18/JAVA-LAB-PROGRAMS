import java.util.Scanner;
public class Shortest_Job_First {
	static class Job implements Runnable {
		int id;
		int n;
		Job(int id, int n) {
			this.id = id;
			this.n = n;
		}
		@Override
		public void run() {
			for (int i = 1; i <= n; i++) {
				System.out.print("J" + id + ":" + i + (i == n ? "" : " "));
				try { 
                    Thread.sleep(20); 
                } 
                catch (InterruptedException ignored) {}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of jobs: ");
		int m = sc.nextInt();
		Job[] jobs = new Job[m];
		for (int i = 1; i <= m; i++) {
			System.out.print("Enter size for job " + i + ": ");
			int n = sc.nextInt();
			jobs[i - 1] = new Job(i, n);
		}
		for (int i = 0; i < m - 1; i++) {
			int min = i;
			for (int j = i + 1; j < m; j++) {
				if (jobs[j].n < jobs[min].n) {
					min = j;
				}
			}
			if (min != i) {
				Job tmp = jobs[i];
				jobs[i] = jobs[min];
				jobs[min] = tmp;
			}
		}
		for (int i = 0; i < m; i++) {
			Thread t = new Thread(jobs[i]);
			t.start();
			t.join();
		}
		sc.close();
	}
}
