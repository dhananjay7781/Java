import java.util.*;
class Bigbazar {
	
	String prodname = null;
	float price = 0.0f;
	
	Bigbazar(String prodname,float price) {                     //ha constructor ahe
		this.prodname = prodname;
		this.price = price;
	}	

	void display() {
		System.out.print("Product :  " + prodname);
		System.out.println("  Price : " + price);
	}
}

class linkedlistconst1 {
	public static void main(String[]args){
		LinkedList ll = new LinkedList();

		ll.add(new Bigbazar("Gahoo",45.50f));
		ll.add(new Bigbazar("Tandool",45));
		ll.add(new Bigbazar("Bajari",45.50f));
		ll.add(new Bigbazar("Jowari",55.05f));
		ll.add(new Bigbazar("Aata",50.25f));

		System.out.println(ll);                                                //ahe asa print kel ki adress print hotil   mhnun tith iterator vaprtat
	
		Iterator itr = ll.iterator();

		while(itr.hasNext()) {
			
			Bigbazar obj = (Bigbazar)itr.next();
			obj.display();                                                      //ith adress yeu naye mhnun tas kelay
		}
	}
}
