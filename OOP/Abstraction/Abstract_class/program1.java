abstract class Baba{
	void getProperty() {
		System.out.println("Bunglow + Car");
	}
}

class Shashi extends Baba{
	void marry(){
		System.out.println("Kriti Sanon");
	}
}

class demo{
	public static void main(String[]args){
	//	Baba b = new Baba();  it is abstract we cant instatinate
	 Shashi s = new Shashi();
	 //Baba s = new Shashi();  reference kel 
	 s.getProperty();
	 s.marry();
	}
}
