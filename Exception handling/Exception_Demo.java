class Exception {
	public static void main(String [] args){
	
	System.out.println("In main");
	fun();
	System.out.println("In main - After Fun");
	}
	static void fun(){
		System.out.println("In fun");
		gun();
	}
	static void gun(){
		System.out.println("In Gun");
	}
}
