class catchsequenec2{
        public static void main(String [] args){
                try{
                        System.out.println(10/0);
                }
                catch(Exception ae){
             	System.out.println("Arithmetic catched");
		}
		catch(ArithmeticException ae){
                        System.out.println("Again Arithmetic catched");
                }
        }
}

//ith pn error yeto karan vrti already exception caught kelays an ajun ka taktoys an to parent class ahe arithmetic exception cha so
