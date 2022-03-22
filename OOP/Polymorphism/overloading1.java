class Hospital {
	void getBed(){
		System.out.println("Normal bed");
	}
	void getBed(String a){
		System.out.println("ICU bed");
	}
}

class Patient{
	public static void main(String[]args){
		Hospital h = new Hospital();
		h.getBed(); //Normal bed
		h.getBed("String dili");  //ICU bed
	}
}
