import java.util.*;
class Employee implements Comparable<Employee> {
	int EmpId;
	String name;
	float sal;
	Employee(int EmpId,String name,float sal){
		this.EmpId;
		this.name;
		this.sal;
	}
	void disp(){
		System.out.println(empId + " " + name + " " + sal);
	}
	public int compareTo(Employee obj) {
		return (int)(sal - obj.sal);
	}
}
class Demo {
	ArrayList<Employee> al = new ArrayList<Employee>();
	al.add(new Employee(3,"Aniket",200000));
	al.add(new Employee(5,"Vedant",90000));
	al.add(new Employee(3,"Ashutosh",70000));
	al.add(new Employee(3,"Pranav",60000));
}
//comparabel  la implement kelay mhnl ki tumhala compare to method compulsory lihavu lagte karan abstract ahe ti or tjmhala abstract lihav lagt  
