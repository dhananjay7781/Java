class Mythread extends Thread {

	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName());
	}
}
class RestartThread {
	public static void main(String[]args){
		Mythread mt = new Mythread();
		mt.start();
		System.out.println("Thread name = " + Thread.currentThread().getName());
		mt.start();
	}
}
