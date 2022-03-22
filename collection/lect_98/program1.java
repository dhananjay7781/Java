import java.util.*;

class USCompanies {
	public static void main(String[]args) {
		Map<String,String> m = new HashMap<String,String>();
	       //1.put() 
	       m.put("Amazon","Jeff Bezos");	
	       m.put("Microsoft","Bill Gates");	
	       m.put("Apple","Steve Jobs");	
	       m.put("Spacex","Elon Musk");	
	       m.put("FaceBook","Mark Zuckerberg");	
	       m.put("Nothing","Carl Pie");	

	       System.out.println(m);
	       
	       //2.get(Key)
	       System.out.println(m.get("Spacex"));
	       
	       //3.remove()
	       m.remove("Apple");               //apple ani techi value nighun jate
	       System.out.println(m);
	       ///////////////////////
	       System.out.println(m.remove("Nothing"));           //carl pie yet output
	       
	       //4.contains(key)   boolean return krt
	       System.out.println(m.containsKey("FaceBook"));   //asel tr true
	       
	       //4.contains(value)   boolean return krt
	       System.out.println(m.containsValue("Carl"));   //false karan ashi value nhiy
	       
	       //5.isEmpty
	       System.out.println(m.isEmpty());
	       
	       //6.size()
	       System.out.println(m.size());
		
	       //7.keyset()
	       System.out.println(m.keySet());
	       
	       //8.Values()
	       System.out.println(m.values());

	       ///////////////<<< IMP >>> ///////////////////
	       
	       //9.entrySet()
	       System.out.println(m.entrySet());
	}
}
