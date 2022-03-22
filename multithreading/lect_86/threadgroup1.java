
class threaddemo extends Thread {
	threaddemo(threadgroup tg,String tname){
		super(tg,tname);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		task();
	}
	void task() {
		try{
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			System.out.println("Interrupt ala");
		}
	}
}
class threadgroup {
	public static void main(String[]args){
		threadgroup tg1 = new threadgroup("Parent Group");

		threaddemo t1 = new threaddemo(tg1,"One");
		threaddemo t2 = new threaddemo(tg1,"Two");
		threaddemo t3 = new threaddemo(tg1,"Three");
	
		System.out.println(tg1.activeCount());

		t1.start();
		t1.start();
		t1.start();
		System.out.println(tg1.activeCount());i
		//tg1.interrupt();        he na interrupt krt vrchya saglyanna 
		//tg1.destroy();           destroy krt he pn ,,,,,,,,,exception yet........... 
	}
}
