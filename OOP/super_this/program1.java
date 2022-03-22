class person {
	int age = 45;
}

class employee extends person {
	int age = 29;
	void printstud(){
		int age = 25;

//		person p = new person();
//		System.out.println(p.age); //45
		System.out.println(super.age); //45
		System.out.println(age);  //25
		System.out.println(this.age);  //29 
	}
}

class main1{
	public static void main(String[]args){
		employee obj = new employee();
		obj.printstud();
	}
}
