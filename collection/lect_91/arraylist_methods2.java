import java.util.*;
class arraylistmethods2 {
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("Facebook");
		al.add("Apple");
		al.add("Amazon");
		al.add("Netflix");  //duplicate data chalto hi pahili method
		al.add("Google");
		al.add("Google");
/*
		System.out.println(al);
		al.remove(5);     //5th element cha data remove krto       index ne remove kelay ithe   
		System.out.println(al);
		*/
		al.remove("Google");
		System.out.println(al);
}
}
