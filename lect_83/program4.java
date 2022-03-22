class newthread extends Thread {
	public void run() {

		System.out.println("Thread name = " + Thread.currentThread().getName());
	}

}

class Mythread extends Thread {

	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName());
		newthread nt = new newthread();
		nt.start();
	}
}

class MultipleThread {
	public static void main(String[] args) {
		Mythread mt = new Mythread();
		mt.start();
		System.out.println("Thread name = " + Thread.currentThread().getName());

	}
}
