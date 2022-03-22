import java.util.*;

class Company {
	String compname;
	double sal;
	Company(String compname, double sal) {
		this.compname = compname;
		this.sal = sal;
	}
	public String toString() {
		return "(" + compname + " " + sal +")";
	} 
}
class Friends {
	public static void main(String[]args) {
		HashMap<String,Company> h = new HashMap<String,Company>();
		h.put("Anpa",new Company("Nvidia",1500000));
		h.put("Panya",new Company("Infosys",700000));
		h.put("Sachin",new Company("Veritas",1200000));
		h.put("Vedya",new Company("EQTech",900000));
		h.put("Ashya",new Company("Cognizent",800000));

		System.out.println(h);       //asa kela ki @ajilwr392h asa kay tr yet object ch nav mg mhnun tostring lihil vrti
	}
}
