import java.util.*;
//compare krtoy apan
class employee implements Comparable<employee>{    //implemetn karav lagt refer notebook
	String empname = null;
	int empid = 0;
	double sal = 0.0;
	employee(String empname,int empid, double sal) {
		this.empid = empid;
		this.sal = sal;
		this.empname = empname;
	}
	public int compareTo(employee emp) {
		return (int)(sal - emp.sal);
	}
}


class treeset{
	public static void main(String[]args) {
		SortedSet<employee> ss = new TreeSet<employee>();
		ss.add(new employee("Ashish",10,35000.00));
		ss.add(new employee("Kanha",60,65000.00));
		ss.add(new employee("Rahul",5,15000.00));
		ss.add(new employee("Rajesh",4,35500.00));
		ss.add(new employee("Badhe",98,85000.00));
		System.out.println(ss);

		for(employee obj : ss) {
			//System.out.print(obj.empid + " " ) ;
			//System.out.println(obj.sal) ;
			System.out.println(obj.empname) ;
		}
	}

}
