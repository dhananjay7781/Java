import java.util.*;
class arraylistmethods {
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("Facebook");
		al.add("Apple");
		al.add("Amazon");
		al.add("Netflix");  //duplicate data chalto hi pahili method
		al.add("Google");
		al.add("Google");
		////////////////////////////////////////////////////////////
		System.out.println(al);
		al.add(2,"Oracle");            //specific index takun tith add krych hi 2nd method
		System.out.println(al);
		////////////////////////////////////////////////////////////
		System.out.println(al.indexOf("Apple"));            //3rd method index kiti ahe dakhvte
		///////////////////////////////////////////////////////////////
		System.out.println(al.lastIndexOf("Google"));            //6 yet output oracle add honar na mg 6 yet  ani shevtchya google cha index ala
		/////////////////////////////////////////////////////////////
		System.out.println(al.indexOf("Infosys"));            //Infosys mhiy taripn acces kryla gelo tr -1 yet output

		System.out.println(al.size());             //7 size deil karan oracle add hoil na so.............
	}
}
