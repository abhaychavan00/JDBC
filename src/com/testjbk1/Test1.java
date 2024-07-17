package com.testjbk1;

import java.util.HashSet;

public abstract class Test1 {

	public static void main(String[] args) {
		Employee e1
		= new Employee(45,"nitin","testor",7000);
		Employee e2
		= new Employee(67,"aadiya","developer",65000);
		Employee e3 = new Employee(55,"prakash","testor",90000);
		Employee e4 = new Employee(75,"megha","developer",80000);
		Employee e5 = new Employee(71,"neha","testor",90000);
		 HashSet<Employee> emplist = new HashSet<Employee>();
		 emplist.add(e1);emplist.add(e2);
		 emplist.add(e3);emplist.add(e4);
		 emplist.add(e5);
		 for (Employee e: emplist) {
			 System.out.println(e);
		 }
		 
		
	}

}
