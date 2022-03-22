class Mythread extends Thread {
	static Thread mainThread = null;
	public void run () {
		System.out.println(mainThread.getName());
		}

	}


class JoinDemo1 
{
	public static void main(String[]args) throws InterruptedException
	{
		Mythread mt = new Mythread();
		mt.start();
		Mythread.mainThread = Thread.currentThread();
		for(int i =0; i<5; i++){
			System.out.println("Parent Thread");
		}
	}
}
