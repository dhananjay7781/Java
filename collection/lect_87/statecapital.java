class statecapital {
	String state;                                    //instance variable
	String capital;                                   //instance variable
	statecapital(String state, String capital) {
		this.state = state;
		this.capital = capital;
	}

}

class userarray {
	public static void main(String[]args) {
		statecapital obj1 = new statecapital("MAHA","Mumbai");
		statecapital obj2 = new statecapital("ZHAR","Ranchi");
		statecapital obj3 = new statecapital("KARNATAKA","Banglore");
		statecapital obj4 = new statecapital("GOA","Panji");
		statecapital obj5 = new statecapital("BIHAR","Patna");

		statecapital sc[] = new statecapital[] {obj1,obj2,obj3,obj4,obj5};
		for(int i =0; i<sc.length; i++) {
		//	System.out.println(sc[i]);                             //asa kel ki address print krel 
			System.out.print(sc[i].state);           //asa ka array ha gola ahe(object) tyatun mala state kadhun de
			System.out.println(" : "+sc[i].capital);  // n hyat tyach golyatun capital kadhun de
		}
	}
}
