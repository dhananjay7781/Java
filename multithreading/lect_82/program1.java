class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
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


//jar obj.run(); kel tr ouput asa yeil ...
//main... core2web 5 veles an nntr biencaps
