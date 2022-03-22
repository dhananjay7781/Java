import java.util.*;

class ITCompany {
	String cname = null;
	int empcnt = 0;
	ITCompany(String cname,int empcnt){
		this.cname = cname;
		this.empcnt = empcnt;
	}
	void info () {
		System.out.println("Company name = " + cname +  "Employee Count = " + empcnt);
	}
}
class arraylist4 {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();

		al.add(new ITCompany("Biencaps",25));                             //customizw obj ptvhle n tyala 2 parameter dile noofemp ani company name
		al.add(new ITCompany("Apple",10000));                             //customizw obj ptvhle n tyala 2 parameter dile noofemp ani company name
		al.add(new ITCompany("Microsoft",12000));                             //customizw obj ptvhle n tyala 2 parameter dile noofemp ani company name
		al.add(new ITCompany("Meta",14000));                             //customizw obj ptvhle n tyala 2 parameter dile noofemp ani company name
		al.add(new ITCompany("Tesla",15000));                             //customizw obj ptvhle n tyala 2 parameter dile noofemp ani company name
		//System.out.println(al);  //asa kel ki te adress n string dkhvt object cha
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			ITCompany obj = (ITCompany)litr.next();
			obj.info();
		}
	}
}
