import java.util.*;

class sortmethods {
	public static void main(String[]args) {
		SortedSet ss = new TreeSet();
		ss.add("C");
		ss.add("React");
		ss.add("Cpp");
		ss.add("Java");
		ss.add("Python");
		System.out.println(ss);
		//First()             methods

		System.out.println(ss.first());
		//last
		System.out.println(ss.last());
		//headset(object)
		System.out.println(ss.headSet("Java"));	         //headset mhnje techya dokyvrch print krt after sort krun
		//tailset(object)
		System.out.println(ss.tailSet("Java"));	         //tailset mhnje techya pudhch print krt after sort krun
		
		//subset(object,object)

		System.out.println(ss.subSet("C","Java"));
		
	
	}
}
