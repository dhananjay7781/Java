class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
	}
}

class getprio {
	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i <5; i++){
			System.out.println("Biencaps");
		}
	}
}
