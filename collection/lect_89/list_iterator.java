import java.util.*;
class listiterator {
	public static void main(String[]args) {
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);

		System.out.println(v);

		ListIterator e = v.listIterator();

		while(e.hasNext()){                                      //hya listIterator chya mmethods ahet
			System.out.println(e.next());
		}
		while(e.hasPrevious()){
			System.out.println(e.previous());                                 //prev pn listiterator chi method ahe
		}
	}
}
