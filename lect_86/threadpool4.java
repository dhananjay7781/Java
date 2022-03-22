import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Mythreadpoolexecutor4 {
	public static void main(String[]args){
		ExecutorService exec = Executors.newFixedThreadPool(10);	
		for(int i=0; i<5;i++){
			threadexedemo task = new threadexedemo("" + i); 		
			exec.execute(task);
		}
		exec.shutdown();
		for(int i=0; i<5;i++){
			threadexedemo task = new threadexedemo("" + i); 		
			exec.execute(task);
		}
	}
}
class threadexedemo implements Runnable{
	String worknum = null;

	threadexedemo(String worknum) {
		this.worknum = worknum;	
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() +  " Start task " + worknum);
		System.out.println(Thread.currentThread().getName() +  " End task ");
	}
		
}
