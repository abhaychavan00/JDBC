package com.demostring;

public class Vowels {

	public static void main(String[] args) {
		
		String s1 = "Education";
		String s2 = s1.toLowerCase();
		for(int i =0; i <s2.length();i++ ) {
	   char ch = s2.charAt(i);
		if(ch  !='a' || ch  != 'e'| ch  != 'i' || ch  != 'o' || ch  !='u' ) {
			System.out.println(ch);
		}
		}
		System.out.println("==================");
		for (int i = s2.length() - 1; i >=0; i--) {
			System.out.println(s2.charAt(i));
		}
	}

}
