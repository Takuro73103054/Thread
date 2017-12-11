package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Thread_run [] th = new Thread_run[n];
		Thread_runnable [] th_run = new Thread_runnable[n];
		
		for(int i = 0;i < n; i++) {
			th[i] = new Thread_run();
			th_run[i] = new Thread_runnable();
			th[i].start();
			th_run[i].run();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("mainから出力　：　"+i);
		}
	}

}
