import java.util.*;
//ha third constructor ahe 
class vectorconstr3{
	public static void main(String []args) {
		Vector v = new Vector(11,5);
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
			
		System.out.println(v.capacity());        //16 yeil capacity karan apan sangitly kiti thevychi capacity
	}
}
