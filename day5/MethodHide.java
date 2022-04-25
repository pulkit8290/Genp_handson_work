package com.org.genp.day5;

class ParentClass{
    public static void classMethod(){
        System.out.println("Class method in super class");
    }
    public void NonStatic() {
        System.out.println("Instancemethod in parent class");
    }
}
 
class ChildClass extends ParentClass{
    public static void classMethod() {
        System.out.println(" Class method in child class");
    }
    public void NonStatic() {
        System.out.println("Instancemethod in child class");
    }
}
public class MethodHide {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
	ParentClass p = new ChildClass();
	p.classMethod();//parent class
	p.NonStatic();//parent class ---- parent class 
	 
	ChildClass c = new ChildClass();
	c.classMethod();//child class----- child class 
	c.NonStatic();//child class ----- child class
	 
	ParentClass p1 = new ParentClass();
	p1.classMethod();//----parent class
	p1.NonStatic();//parent class 
	    }
 
}