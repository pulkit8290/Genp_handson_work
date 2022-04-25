package com.org.genp.day3;
abstract class MotorBike {
	MotorBike(){
		System.out.println("Motor Bike is created----> Constructor");
	}
	  abstract void brake();
	  abstract void Gears();
	  abstract void Clutch();
	  abstract void Speed();
	  
	 void Color(){
		  System.out.println("Motor bike color------>Non Abstract method");
	  }
	 void Model(){
		  System.out.println("Motor bike Model ------>Non Abstract method\n\n");
	  }
	 void CompanyName(){
		  System.out.println("Motor bike COMPANY name ------>Non Abstract method");
	  }
	  
     }

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike Brake------>Abstract method");
	  }
	  public void Gears() {
		    System.out.println("SportsBike Gears------>Abstract method");
		  }
	  public void Clutch() {
		    System.out.println("SportsBike Clutch------>Abstract method");
		  }
	  public void Speed() {
		    System.out.println("SportsBike Speed------>Abstract method");
		  }
	  
	}
	
	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Brake------>Abstract method");
	  }
	  public void Gears() {
		    System.out.println("MountainBike Gears------>Abstract method");
		  }
	  public void Clutch() {
		    System.out.println("MountainBike Clutch------>Abstract method");
		  }
	  public void Speed() {
		    System.out.println("MountainBike Speed------>Abstract method");
		  }
	  
	}

	class Bikes {
	  public static void main(String[] args) {
	    MotorBike m1 = new MountainBike();
	    m1.brake();
	    m1.Gears();
	    m1.Clutch();
	    m1.Speed();
	    m1.Color();
	    m1.CompanyName();
	    m1.Model();
	   
	    MotorBike s1 = new SportsBike();
	    s1.brake();
	    s1.Gears();
	    s1.Clutch();
	    s1.Speed();
	    s1.Color();
	    s1.CompanyName();
	    s1.Model();
	    
	}
	  }
	
