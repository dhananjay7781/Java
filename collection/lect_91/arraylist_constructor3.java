import java.util.*;
//hyat 3rd constructor vaprun kelay notebook mdhe lihilay
class alconstruct3 {
	public static void main(String[]args){
	ArrayList al1 = new ArrayList();
	al1.add(10);
	al1.add(10);
	al1.add(10);
	al1.add(10);
	al1.add(10);
	al1.add(10);
	System.out.println(al1); 
	
	ArrayList al2 = new ArrayList(al1);
	al2.add(20);
	al2.add(20);
	System.out.println(al2);
	}
}
