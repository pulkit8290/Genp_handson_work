package com.org.genp.day5;

import java.lang.Math;
class Parent{
	String name = "parent class";
	public static void squareroot(int num) {
		double val = Math.sqrt(num);
		System.out.println("The square root of "+num+" is "+val);
	}
	
	public void formula(int a, int b) {
		System.out.println("(A+B)^2 is: "+Math.pow((a+b),2));
	}

}


class Child extends Parent{
	String name ="Child class";
	public static void squareroot(int num) {
		System.out.println("The area of circle is: "+Math.PI*num*num);
	}
	

}


class newChild extends Child{
	String name="new child class";
	public static void squareroot(int num) {
		System.out.println("The area of square is: "+num*num);
	}


	
}

public class MethodHiding {

	public static void main(String[] args) {
		Parent p = new newChild();
		
		System.out.println("Parent class reference with child class object");
		System.out.println(p.name);
		p.squareroot(49);
		p.formula(20, 20);
		System.out.println("------------------------------------------");
		System.out.println("parent class ref with parent class object");
		Parent p1 = new Parent();
		System.out.println(p1.name);
		p.squareroot(64);
		p.formula(10,20);
		System.out.println("------------------------------------------");
		
		System.out.println("child class ref with child class object");
		Child c = new Child();
		System.out.println(c.name);
		c.squareroot(5);
		
		System.out.println("------------------------------------------");
		System.out.println("newchild class ref with newclass object");
		newChild n = new newChild();
		System.out.println(n.name);
		n.squareroot(13);
		

	}

}