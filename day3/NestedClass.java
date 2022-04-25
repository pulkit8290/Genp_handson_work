package com.org.genp.day3;

class Mobile{    
	double price; 
	String TypeOfMobile; 
	double Manufacturer; 
 
	class Processor{        
		
		String manufacturer;        
		double getCache(){            
			return 8.3;        
			}    
		}    
	protected class RAM{        
		   
		double memory;        
		double getClockSpeed(){ 
			return 23.5;        
			}    
		}
	}
public class NestedClass {  
	public static void main(String[] args) {      
		     
		Mobile mob = new Mobile();         
		Mobile.Processor processor = mob.new Processor();         
		Mobile.RAM ram = mob.new RAM();       
		System.out.println("Processor Cache = " + processor.getCache());       
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());   
		}
	
	}
	
