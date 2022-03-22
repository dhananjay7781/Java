class stringbufferarray1{
	public static void main(String[]args){
		StringBuffer s1 = new StringBuffer("Amazon");
		StringBuffer s2 = new StringBuffer("Google");
		StringBuffer s3 = new StringBuffer("Apple");
		StringBuffer s4 = new StringBuffer("Microsoft");
	//	StringBuffer s4 = new StringBuffer("Microsoft");    
		StringBuffer s5 = new StringBuffer("Tesla");

		Object strarr[] = new Object[] {s1,s2,s3,s4,s5};
		for(int i =0; i<strarr.length;i++) {
			System.out.println(strarr[i]);
		}
	}
}
