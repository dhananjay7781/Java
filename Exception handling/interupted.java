class inturrupted {
	public static void main(String []args){
	
		Thread t = new Thread();
		t.start();
		System.out.println("Core2Web");

		t.sleep(5000);

		System.out.println("Biencaps");

	}
}

//thread he lihily karan new thread kelay ani tela 5 sec sthi sleep ho mhnly n nntr te khalch output print kr mhnly
