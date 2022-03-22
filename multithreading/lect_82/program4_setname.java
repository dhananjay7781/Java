class ThreadDemo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i<5; i++){
			System.out.println("Core2web");
		}
	}
}

class setname {
	public static void main(String[] args) {
	
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		obj.setName("Dhanu");		
		System.out.println(Thread.currentThread().getName());
		
		//Thread.currentThread().setName("Changedmain");
		//System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <5; i++){
			System.out.println("Biencaps");
		}
	}
}

main thread ch nav change krych asel tr comment kelele kadhne
