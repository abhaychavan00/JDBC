package com.demostring;

public class Pallindrome {

	public static void main(String[] args) {
		String s1 = "NITIN";
		String s2 = s1.toLowerCase();
		String rev = "";
		
		for (int i = s2.length() - 1; i >=0; i--){ 
			rev = rev +(s2.charAt(i));
		}
		if (rev.equals(s2)) {
			System.out.println("String is pallindrome");
			
		}
		else {
			System.out.println("String is not pallindrome");
		}

	}

}
