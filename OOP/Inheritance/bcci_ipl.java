class BCCI{
	int x = 10;
	BCCI(){
		System.out.println("In BCCI constructor");
	}
	void bcciRules(){
		System.out.println("BCCI rules");
	}
}

class IPL extends BCCI{
	int y = 20;
	IPL(){
		System.out.println("In IPL Constructor");
	}
	void iplRules(){
		System.out.println("IPL rules");
	}
}

class match {
	public static void main(String[]args){
		IPL obj = new IPL();
		obj.iplRules();
		obj.bcciRules();
		
	/*	BCCI obj = new BCCI();
		//obj.iplRules();
		obj.bcciRules(); */                // chalt pn ipl mdhle kay acces nhi krta yet
	}
}
