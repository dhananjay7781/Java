class Mythread extends Thread {
	static Thread mainThread = null;
	public void run () {
		try{
		mainThread.join();
		}catch (InterruptedException ie){}
		for(int i =0; i<5; i++){
			System.out.println("Child Thread");
		}
		}

	}


class JoinDemo2 
{
	public static void main(String[]args)
	{
		Mythread mt = new Mythread();
		mt.start();
		Mythread.mainThread = Thread.currentThread();
		for(int i =0; i<5; i++){
			System.out.println("Parent Thread");
		}
	}
}
