package com.org.genp.day2;

class A{
    int x ; String n;
 
    public A(int x, String n) {
        super();
        this.x = x;
        this.n = n;
    }
    void display() {
        System.out.println(n+"  " +x);
    }
}
class B1  extends A{
    int y ; int p ;

    public B1(int x, String n , int y , int p) {
        super(x, n);
        // TODO Auto-generated constructor stub
        this.y=y;
        this.p=p;
    }
 
    void print() {
        System.out.println(y+" "+p);
    }
}
 
class C extends B1 {
    int a , b , c ;
    public C(int x, String n, int y, int p, int a, int b, int c) {
        super(x, n, y, p);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int calculate(int p1 , int p2 , int p3) {
        int p4 = p1+p2+p3;
        return p4;
    }

}
class NewClass1 extends C{
    String name  , address;
 
    
    public NewClass1(int x, String n, int y, int p, int a, int b, int c, String name, String address) {
        super(x, n, y, p, a, b, c);
    	this.x = x;
        this.n = n;
        this.y=y;
        this.p=p;
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
        this.address = address;
        
       
    }
    void display1() {
        System.out.println(x+" "+n+" "+y+" "+p+" "+a+" "+b+" "+c+" "+name+" "+address );
    }

}
 
public class FinalClass {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	A a1 =new A(5,"pulkit");
    	B1 b1 =new B1(9,"soni",6,7);
    	C c1 =new C(15,"pullu",16,17,8,2,4);
    	NewClass1 n1 =new NewClass1(25,"kit",26,27,28,12,14,"soni","Beawar");
    	
    	
    	a1.display();
    	b1.print();
    	System.out.println(c1.calculate(12,13,14));
    	n1.display1();
 
    }
 
}
