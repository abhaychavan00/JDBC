package com.tka.java8;

public class Test {

	public static void main(String[] args) {
    X obj ;
    obj = (a,b) -> a*b;
    System.out.println(obj.ops(28, 10));
    
    obj = (a,b) -> a+b;
    System.out.println(obj.ops(286, 10));obj = (a,b) -> a+b;
    
    System.out.println(obj.ops(288, 10));obj = (a,b) -> a/b;
    System.out.println(obj.ops(280, 10));
    
    obj = (a,b) -> a%b;
    System.out.println(obj.ops(26, 10));
    
    obj = (a,b) -> a*b;
    System.out.println(obj.ops(-14, 10));
    
    obj = (a,b) -> a/b;
    System.out.println(obj.ops(-28, -10));

	}

}
