class IPLplayer{
	String name = "KL Rahul";
	int runs2020 = 524;
	static int totalruns = 3420;

	void playerInfo(){
		System.out.println("Orange cap");
		System.out.println("IPL2020 run = " + runs2020);
		System.out.println("Total ipl runs = " + totalruns);
	}
	public static void main(String[]args){
		IPLplayer obj = new IPLplayer();
		obj.playerInfo();
		//System.out.println("IPL2020 run main mdhe ahe = " + runs2020);  error yetoyy
		System.out.println("IPL2020 run main mdhe ahe = " + obj.runs2020);  
		System.out.println("player name main mdhe ahe = " + obj.name);  
	}
}
