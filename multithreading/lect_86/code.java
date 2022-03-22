/*class dany {
	public static void main(String[]args){
	  	gun();
		gun();
	}	
}*/
class panu {
	 void gun() {                                                                 //public, protected,static, ahe asa thevl tri chalt, private lihil ki nahi hot access
		int a,b,sum=0;
		a = 7;
		b=8;
		sum = a+b;
		System.out.println(sum);
	}
}
class dany {
	public static void main(String[]args){
		panu obj = new panu(); 
		obj.gun();
		obj.gun();
	}	
}
