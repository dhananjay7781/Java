class threadDemo extends Thread{
	public void run(){
		System.out.println("In run Method");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name = " + threadName);
	}
	public static void main(String [] args) {
		
		threadDemo t = new threadDemo();
		t.start();

		System.out.println("MultiThreading");
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name = " + threadName);
	}
}


//details notebook mdhe lihilet
