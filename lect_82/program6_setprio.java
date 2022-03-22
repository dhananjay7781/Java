class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
	}
}

class setprio {
	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		obj.setPriority(7);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i <5; i++){
			System.out.println("Biencaps");
		}
	}
}
