class Daemonthread extends Thread {
	public void run () {
		for (int i = 0; i<1000; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie){
			
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class daemon2 {
	public static void main(String [] args) {
		Daemonthread dt1 = new Daemonthread();
		Daemonthread dt2 = new Daemonthread();
		Daemonthread dt3 = new Daemonthread();

		dt2.setDaemon(true);                                         //daemon thread kela hela usinf setDaemon method of Daemon Thread

		dt1.start();
		dt2.start();
		dt3.start();
	}
}
