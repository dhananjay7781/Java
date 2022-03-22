import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Mythreadpoolexecutorsingle {
	public static void main(String[]args){
		ExecutorService exec = Executors.newSingleThreadExecutor();	
		for(int i=0; i<20;i++){
			threadexedemo task = new threadexedemo("" + i); 		
			exec.execute(task);
		}
		exec.shutdown();
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
