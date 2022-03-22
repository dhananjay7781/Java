class catchsequenec1{
	public static void main(String [] args){
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic catched");
		}
			catch(ArithmeticException ae){
			System.out.println("Again Arithmetic catched");
		} 
	}
}

//ith double double Arithmetic exception lihliy pn ekach lagty so to compile time la error deto
