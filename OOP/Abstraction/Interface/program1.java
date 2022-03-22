interface Yewale{
	void makingTea();
        default	void creameroll(){    // default or static lihil tr chalte above 1.7 version
		System.out.println("Owns Creameroll");
	}
}

class Puneyewale implements Yewale{
	public void makingTea(){  //public ka? tarinterface mdhli ublic ahe so ith pn dyav lagel 
		System.out.println("Open at 7Am");
		System.out.println("Best Taste");
	
	}
}
class Baramatiyewale implements Yewale{
	public void makingTea(){
		System.out.println("Open at 8Am");
		System.out.println("Best Taste");	
	}
}

class chaha{
	public static void main(String[]args){
	//	Yewale y = new Yewale();     //interface ahe so object nhi banvu shkt 
		Yewale y = new Puneyewale(); //yewale reference hou shkt
		y.makingTea();
		y.creameroll();
		
		Yewale y1 = new Baramatiyewale();
		y1.makingTea();
		y.creameroll();
	}

}
