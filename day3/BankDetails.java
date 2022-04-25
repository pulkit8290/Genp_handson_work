package com.org.genp.day3;


interface Bank{  
	String BankInfo();
	String RBIrules();
	String SIPmethods();
	float rateOfInterest();  


}  
class SBI implements Bank{  
	public String BankInfo(){
		return ("State Bank of India is an Indian multinational public sector bank "
				+ "and financial services statutory body headquartered in Mumbai, Maharashtra.");
		} 
	public String RBIrules(){
		return ("Mandates all merchants to use encrypted tokens to carry out transactions.");
		} 
	public String SIPmethods(){
		return ("SIP method");
		} 
	public float rateOfInterest(){
		return 9.45f;
		} 
}  
class ICICI implements Bank{  
	public String BankInfo(){
		return ("ICICI Bank Limited is an Indian multinational bank and financial services company headquartered in Vadodara.");
		} 
	public String RBIrules(){
		return ("Mandates all merchants to use encrypted tokens to carry out transactions.");
		} 
	public String SIPmethods(){
		return ("SIP method");
		} 
	public float rateOfInterest(){
		return 9.25f;
		} 
	}  
 
class HDFC implements Bank{  
	public String BankInfo(){
		return ("HDFC Bank Limited is an Indian banking and financial services company headquartered in Mumbai.");
		} 
	public String RBIrules(){
		return ("Mandates all merchants to use encrypted tokens to carry out transactions.");
		} 
	public String SIPmethods(){
		return ("SIP method");
		} 
	public float rateOfInterest(){
		return 9.15f;
		} 
}  
class AXIS implements Bank{  
	public String BankInfo(){
		return ("Axis Bank Limited, formerly known as UTI Bank, is an Indian banking and "
				+ "financial services company headquartered in Mumbai, Maharashtra.");
		} 
	public String RBIrules(){
		return ("Mandates all merchants to use encrypted tokens to carry out transactions.");
		} 
	public String SIPmethods(){
		return ("SIP method");
		} 
	public float rateOfInterest(){
		return 9.35f;
		} 
}  

class BankDetails{ 
	
	public static void main(String[] args){  
	Bank b=new SBI(); 
	System.out.println("SBI BANK DETAILS");
	System.out.println("ROI: "+b.rateOfInterest());
	System.out.println("Bank Info: "+b.BankInfo());
	System.out.println("RBI Rules: "+b.RBIrules());
	System.out.println("SIP Methods: "+b.SIPmethods());  
	
	Bank b1= new HDFC();
	System.out.println("\n\nHDFC BANK DETAILS");
	System.out.println("ROI: "+b1.rateOfInterest());
	System.out.println("Bank Info: "+b1.BankInfo());
	System.out.println("RBI Rules: "+b1.RBIrules());
	System.out.println("SIP Methods: "+b1.SIPmethods());  
	
	Bank b2= new ICICI();
	System.out.println("\n\nICICI BANK DETAILS");
	System.out.println("ROI: "+b2.rateOfInterest());
	System.out.println("Bank Info: "+b2.BankInfo());
	System.out.println("RBI Rules: "+b2.RBIrules());
	System.out.println("SIP Methods: "+b2.SIPmethods());  
	
	Bank b3= new AXIS();
	System.out.println("\n\nAXIS BANK DETAILS");
	System.out.println("ROI: "+b3.rateOfInterest());
	System.out.println("Bank Info: "+b3.BankInfo());
	System.out.println("RBI Rules: "+b3.RBIrules());
	System.out.println("SIP Methods: "+b3.SIPmethods());  
	}
}  