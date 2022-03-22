class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
	}
	public void start() {
		System.out.println("My Start");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadScenario {
	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();           
		
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <5; i++){
			System.out.println("Biencaps");
		}
	}
}

//run navachya method la call nhiy kela ith....
