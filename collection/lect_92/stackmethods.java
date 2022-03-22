import java.util.Stack;

class stackmethods {
	public static void main(String[]args) {
		Stack s = new Stack();
		//os names of smartphones
		s.add("IOS");
		s.addElement("OxygenOs");
		s.push("ColorOs");      //hi stack chi method ahe pn same as add and addElement
		s.addElement("FunTouchOs");
		System.out.println(s);
		//pop method
		s.pop();
		System.out.println(s);  //shevtcha udavto karan LIFO
		//peek method
		System.out.println(s.peek()); //shevtcha kadhun dkhvt
		//search sthich
		System.out.println(s.search("ColorOs"));            //index kadht pn khalun kadht karan stack mdhe te vrti jaun basly     //1 yet output
		System.out.println(s.search("FunTouchOs"));            //index kadht pn khalun kadht karan stack mdhe te vrti jaun basly  //-1
		System.out.println(s.search("IOS"));            //index kadht pn khalun kadht karan stack mdhe te vrti jaun basly  //3
		System.out.println(s.search("OxygenOs"));            //index kadht pn khalun kadht karan stack mdhe te vrti jaun basly  //2
	}
}
