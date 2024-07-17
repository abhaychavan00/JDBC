package fileSerrilization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerilizationTest {
	public static void main(String[] args) {
		Student s1 = new Student("Abhay",20,"Pune");
		
		try {
			FileOutputStream a1=new FileOutputStream("C:/Abhay/Source.txt");
			ObjectOutputStream m1= new ObjectOutputStream(a1);
			m1.writeObject(s1);
			System.out.println("Serialization is done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	

	}

}
