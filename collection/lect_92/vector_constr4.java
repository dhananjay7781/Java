import java.util.*;
//ha Fourth constructor ahe 
class vectorconstr4{
	public static void main(String []args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10);
		al.add(10);

		Vector v = new Vector(al);
		System.out.println(v);        //11 yeil capacity karan apan 11 sangitly tith
		
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		System.out.println(v);        
	}
}
