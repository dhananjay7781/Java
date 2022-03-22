class Mythread extends Thread {
	public void run () {
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
			try{
			Thread.sleep(2000);
			}catch (InterruptedException ie){
				System.out.println("ExceptionCaught");
			}
		}

	}
}

class JoinDemo 
{
	public static void main(String[]args) throws InterruptedException
	{
		Mythread mt = new Mythread();
		mt.start();
		mt.join();
		for(int i=0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
}
