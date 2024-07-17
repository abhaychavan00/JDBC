package exceptionhandaling;

public class Exception {
	public static void main(String[] args) {
		
	try {
		int a= 10;
		int b=0;
	float r=a/b;
	}
	catch(Exception e){
	System.exit(0);
	
	}
	finally {
		System.out.println("finally...");
	}
	}

}
