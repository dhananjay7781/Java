import java.util.*;
class hashsetdemo2 {
	public static void main(String[]args) {
		Set s = new HashSet();
		s.add("Dhananjay");
		s.add("Aniket");
		s.add("Vedant");
		System.out.println(s.add("Ashutosh"));     //true          jar adihi vrti nasel tr true pthvel 
		System.out.println(s.add("Pranav"));       //true
		System.out.println(s.add("Ashutosh"));      //false          adhi ahe vrti mag false yenar
		System.out.println(s);
	}
}
