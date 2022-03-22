import java.util.*;
class Linkedlistmethods {
	
	public static void main(String[]args) {
		LinkedList ll = new LinkedList();

		ll.add("C");
		ll.add("Cpp");
		ll.add("JAVA");
		ll.add("C#");
		ll.add("Flutter");
		ll.add("C#");

		System.out.println(ll);
		//ith index vr jaun add kelay
		ll.add(4,"Networking");
		System.out.println(ll);
		
		//addFirst() he method first index la add krte 
		ll.addFirst("React");
		System.out.println(ll);
		
		//addLast() he method Last index la add krte 
		ll.addLast("Angular");
		System.out.println(ll);
		
		
		//Removefirst() he method First index cha element kadhte 
		ll.removeFirst();
		System.out.println(ll);
		
		//Removefirst() he method Last index cha element kadhte 
		ll.removeLast();
		System.out.println(ll);

		//index of object
		System.out.println(ll.indexOf("JAVA"));
	
		//set(index,Object)   ha tith jato n change krto or replace mhnu shkto apan
		ll.set(6,"Swift");
		System.out.println(ll);
		
	}
}
