import java.util.*;
class vectorcapacity{
	public static void main(String[]args) {
		Vector v = new Vector();
		System.out.println(v.capacity());    //10 yete output karan default capacity 10 ahe
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(500000);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(500000);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);
	
		System.out.println(v);    
		System.out.println(v.capacity());   

	}
}
