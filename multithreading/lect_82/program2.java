//overload kelay hya code mdhe

class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
	}
	public void run(int x) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i<5; i++){
			System.out.println("Incubator");
		}
	}
}

class ThreadScenario2 {
	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		obj.run(1);
		
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <5; i++){
			System.out.println("Biencaps");
		}
	}
}
//overload krych asel tr int x parameter dyav lagti
