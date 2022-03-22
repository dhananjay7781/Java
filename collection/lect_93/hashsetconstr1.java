import java.util.*;
class hashconstr {
	public static void main(String[]args) {
		HashSet hs = new HashSet();
		hs.add("Apple");
		hs.add("Samsung");
		hs.add("OnePlus");
		hs.add("Vivo");
		hs.add("Oppo");
		System.out.println(hs);
		Iterator itr = hs.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//contains method
		
		System.out.println(hs.contains("Realme"));
		System.out.println(hs.contains("Oppo"));
		//size
		System.out.println(hs.size());
		//remove
		System.out.println(hs.remove("Oppo"));
		System.out.println(hs);
		//clear
		hs.clear();
		System.out.println(hs);
	}
}
