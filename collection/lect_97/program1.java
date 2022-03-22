import java.util.*;

class Employee {
	public static void main(String[]args) {
		Map<Integer,String> m = new HashMap<Integer,String>();              //<Integer,String> he note kadysthi add kel
		m.put(103,"Anpa");	
		m.put(1354,"Vedya");	
		m.put(165,"Ashya");	
	//	m.put(1354,"Om");      //ith duplicate takly so te 1354 la om replace krt n vedya print nhi hot  	
		m.put(1766,"Sachin");
		m.put(116,"Panya");  //hyat insertion order preseve nhi hot mhnje kas pn yet output	
		System.out.println(m);
	}
}

//duplocate key chalat nhi pn error pn nhi yet
