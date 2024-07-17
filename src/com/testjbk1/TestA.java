package com.testjbk1;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
  Product p1=new Product(56,"pen","stationary",20);
  Product p2=new Product(59,"mobile","electronics",20000);
  Product p3=new Product(61,"panner","dairy",100);
  Product p4=new Product(67,"pencil","stationary",10);
  Product p5=new Product(57,"pendrive","electronics",800);
  ArrayList<Product> a1=new ArrayList<Product>();
  a1.add(p1);
  a1.add(p2);
  a1.add(p3);
  a1.add(p4);
  a1.add(p5);
 
  for(Product t:a1) {
	  double ans = t.getPrice() - t.getPrice() *0.20;
	  t.setPrice(ans);
  }
  a1.forEach(s->System.out.println(s));
   
	}

}
