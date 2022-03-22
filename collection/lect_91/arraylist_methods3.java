import java.util.*;
class arraylistmethods3 {
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("Facebook");
		al.add("Apple");
		al.add("Amazon");
		al.add("Netflix");  //duplicate data chalto hi pahili method
		al.add("Google");
		al.add("Google");
		


		System.out.println(al);             //clone method vaprli mhnje duplicate ahe ashi list
	
		ArrayList al2 = (ArrayList)al.clone();    // typecaste kelay so ArrayList lihul bracket mdhe karan return type
	
		System.out.println(al2);
	
		al.clear();
		System.out.println(al);
		System.out.println(al2);
	}
}
