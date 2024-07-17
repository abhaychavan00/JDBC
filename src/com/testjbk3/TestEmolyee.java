package com.testjbk3;

public class TestEmolyee {
	 int id;
	 String name;
	 double salary;
	 String role;
	 
	

public TestEmolyee(int id, String name, double salay, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salay;
		this.role = role;
}



@Override
public String toString() {
	return "TestEmolyee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
}

public int getId () {
	return id;
}
 public void SetId(int id) {
this.id= id ;
}
  public String getName() {
	  return name;
	  
  }
public void setName (String name) {
	this.name = name;
	
}
public double getsalary() {
	return salary;
}
public void setsalary(double salary) {
	this.salary = salary;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
}




	

	