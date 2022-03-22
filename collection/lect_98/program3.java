import java.util.*;

class ArrayListDemo {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
		al.add("Vedya");
		al.add("Anpa");
		al.add("Panya");
		al.add("Ashya");
		al.add("Sachin");

		System.out.println(al);

		Iterator itr = al.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
