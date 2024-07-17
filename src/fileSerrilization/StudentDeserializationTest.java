package fileSerrilization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class StudentDeserializationTest {

	public static void main(String[] args) {
		try {
			FileInputStream x1= new FileInputStream("C:/Abhay/Source.txt");
			ObjectInputStream k1 = new ObjectInputStream(x1);
			Student p =(Student) k1.readObject();
			
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
