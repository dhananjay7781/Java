import java.util.*;

class vectormethods {
	public static void main(String[]args) {
		Vector v = new Vector();
	       v.addElement("Dhananjay");	
	       v.addElement("Ashya");	
	       v.addElement("Anpa");	
	       v.addElement("Paranav");	
	       v.addElement("Vedant");	

	       System.out.println(v);
	       //Size element kitt dkhvt
	       System.out.println(v.size());
	       //isEmpty()
	       System.out.println(v.isEmpty());
	       //element at()
	       System.out.println(v.elementAt(2));
	       //setElementAt()
	       v.setElementAt("Omi",4);
	       System.out.println(v);
	       //removeElementAt()
	       v.removeElementAt(4);
	       System.out.println(v);
		//object ne remove kel
		v.removeElement("Anpa");
	       System.out.println(v);
		//remove range vaprun bgha kay hoty
	}
}
