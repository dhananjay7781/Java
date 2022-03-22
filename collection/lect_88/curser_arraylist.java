import java.util.*;

class arraylist1 {
	public static void main(String[]args) {
		ArrayList <String> al = new ArrayList<String>();
	//	ArrayList al = new ArrayList();    he doni uncomment kel tr 1000 pn print hoil
		al.add("Sinhgad");
		al.add("Zeal");
		al.add("JSPM");
		al.add("Trinity");
//		al.add(10000);   error yeto compile time la te vrti <String> asa kelay mg int nahi chalat
		System.out.println(al);
	}
}
