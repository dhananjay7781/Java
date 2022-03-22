class threaddemo extends Thread {

	public void run(){

		System.out.println(Thread.currentThread().getName()); //Thread ch nav deil hi line      -----Thread-0 yet
		
		for(int i = 0; i<10; i++){
			System.out.println("Core2web");       //thread 0 yenar n hya class mdhe run honar 
		}
	}
}

class demo {
	
	public static void main(String [] args ){
	
		threaddemo t = new threaddemo();
		t.start();
		
		System.out.println(Thread.currentThread().getName()); //Thread ch nav deil hi line     --------Main yenar
		
		for(int i = 0; i<10; i++){
			System.out.println("Biencaps");        //n hya mdhe main thread yenar n run honar
		}
	
	}

}
