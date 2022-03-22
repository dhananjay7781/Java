class sleepdemo extends Thread {
	public void run()   {
		System.out.println("In Run");
		for(int i = 0; i<10; i++){
			System.out.println("Child Thread");
		try{
		sleep(2000);
		}catch (InterruptedException ie){

		}
		}
	}
}

class Threaddemo1  {
	public static void main(String[] args) throws InterruptedException {
		sleepdemo sd = new sleepdemo();
		sd.start();
		for(int i = 0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
}
