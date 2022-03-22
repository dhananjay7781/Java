import java.util.*;

class USCompanies2 {
	public static void main(String[]args) {
		Map<String,String> m = new HashMap<String,String>();
	    
	       m.put("Amazon","Jeff Bezos");	
	       m.put("Microsoft","Bill Gates");	
	       m.put("Apple","Steve Jobs");	
	       m.put("Spacex","Elon Musk");	
	       m.put("FaceBook","Mark Zuckerberg");	
	       m.put("Nothing","Carl Pie");	

	      System.out.println(m);

	      Set<Map.Entry<String,String>> entry = m.entrySet();          //adhi string-> error mg Map->error mhnun asa
	      
	      Iterator<Map.Entry<String,String>> itr = entry.iterator();
	     ///////>>> getvalue, getkey,setvalue metod kelet use
	      while(itr.hasNext()){
	      		Map.Entry<String,String>actualentry = itr.next();
			System.out.print(actualentry.getKey() + " -> ");    //key kadhun det ek ek 
			System.out.println(actualentry.getValue());    //values kadhun det ek ek 
	      		
			if(actualentry.getKey().equals("Apple")){
				actualentry.setValue("Tim Cook");
			}
	      }
	      System.out.println(m);
	}
}
