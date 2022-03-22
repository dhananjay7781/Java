class sleepdemo extends Thread {
	public void run() {
		System.out.println("In Run");
		for(int i = 0; i<10; i++){
			System.out.println("Child Thread");
		}
	}
}

class Threaddemo  {
	public static void main(String[] args) throws InterruptedException {
		sleepdemo sd = new sleepdemo();
		sd.start();
		sd.sleep(2000);
		for(int i = 0; i<10; i++){
			System.out.println("Main Thread");
	//		sd.sleep(2000);
		}
	}
}
