package fileSerrilization;
import java.io.*;
public class Student implements Serializable{
	 String name;
	 int age;
	 String location;
	public Student() {
		super();
	}

	public Student(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	

}
