class Bhau {
	void getProperty(){
		System.out.println("Bunglow");
	}
	void career(){
		System.out.println("Dhanu doctor vhawa");		
	}
	void marry(){
		System.out.println("Marry=>emilia");		
	}
}

class dhanu extends Bhau{
	void career(){
		System.out.println("Dhanu Engineer zala");
	}
	void marry(){
		System.out.println("Marry=>Kriti sanon");		
	}
}

class Kaka {
	public static void main(String[]args){
	
		//kaka n bhau
		Bhau b = new Bhau();
		b.getProperty();  //bunglow
		b.career(); //Doctor
		b.marry();  //emilia
		
		//kaka n mi
		dhanu d = new dhanu();
		d.getProperty();  //bunglow
		d.career(); //engineer zala
		d.marry();  //kriti sanon
	
		//kaka n mi n bhau  helach dynamic dispatch mhntat khalchyala

		Bhau b1 = new dhanu();
		b1.getProperty();  //bunglow
		b1.career(); //teacher
		b1.marry();  //kriti sanon
		
		
		//child cha reference an parent cha object not possible
		
	//	dhanu d1 = new Bhau();
	}
}
