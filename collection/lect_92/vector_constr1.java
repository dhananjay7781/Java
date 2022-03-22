import java.util.*;
//ha second constructor ahe first vale adhich bghitlet 
class vectorconstr1 {
	public static void main(String []args) {
		Vector v = new Vector(11);
		System.out.println(v.capacity());        //11 yeil capacity karan apan 11 sangitly tith
		
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
		v.addElement(10);
			
		System.out.println(v.capacity());        //22 yeil capacity karan apan formula => (current capacity)*2 sangitly tith
	}
}
