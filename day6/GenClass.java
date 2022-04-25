package com.org.genp.day6;
class Generic<T> {
	T obj;
	Generic(T o1) { obj = o1; }
	T getobj1() 
	{
		return obj;
	}
}
class Generic1<T, V> extends Generic<T> {

	V obj2;
	Generic1(T o1, V o2)
	{
		super(o1);
		obj2 = o2;
	}

		V getobj2() 
		{ 
			return obj2;
		}
}
class GenClass {

	public static void main(String[] args)
	{
	
		Generic1<String, Integer> x	= new Generic1<String, Integer>("value : ",20);

		System.out.println(x.getobj1());
		System.out.println(x.getobj2());
	}
}
