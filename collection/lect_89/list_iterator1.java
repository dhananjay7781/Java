import java.util.*;
class listiterator1 {
	public static void main(String[]args) {
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);

		ListIterator e = v.listIterator();

		while(e.hasNext()){      			//hya listIterator chya mmethods ahet
			Integer I = (Integer)e.next();
			if(I == 30){
				e.set(60);                         //set hi method value set krte
			}
			System.out.println(e.next());
		}
		while(e.hasPrevious()){
			System.out.println(e.previous());                                 //prev pn listiterator chi method ahe
		}
	}
}
