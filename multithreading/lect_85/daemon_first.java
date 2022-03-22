class Daemonthread extends Thread {
	public void run () {
		for (int i = 0; i<5000; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie){
			
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class daemon1 {
	public static void main(String [] args) {
		Daemonthread dt1 = new Daemonthread();
		Daemonthread dt2 = new Daemonthread();
		Daemonthread dt3 = new Daemonthread();
		dt1.start();
		dt2.start();
		dt3.start();
	}
}
