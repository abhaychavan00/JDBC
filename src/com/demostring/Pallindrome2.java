package com.demostring;

public class Pallindrome2 {
	public static void main(String[] args) {
		String s = "java by kiran";
		String s2[] = s.split(" ");
		String rev="";
		
		for (int i =0; i<s2.length;i++) {
			if(i==s2.length-1) {
				rev=s2[i]+rev;
			}
			else {
				rev= " "+s2[i]+rev;
		}
		}                                     
		
              System.out.println(rev);
              System.out.println("=:=:=:=:=:=:=:=:=:=:=:=");
              for (int i = s.length()-1 ; i >=0; i--) {
      			System.out.print(s.charAt(i));
      			
      		}
		
	}
}
		
	
	

