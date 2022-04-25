package com.org.genp.day7;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	static void TrimMethod( List<String> str1) {
		List<String> str2 = new ArrayList<>();
		
		for (String s: str1) {
			str2.add(s.trim());
			
			
		}
		System.out.println("Original"+"    "+": "+str1);
		System.out.println("Trimmed"+"    "+": "+str2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str1 = new ArrayList<>();
		
		str1.add("    soniji    ");
		str1.add("    D pullu");
		str1.add("    ankit");
		str1.add("rahul    ");
		str1.add("    dinakar         bro");
		
		Test.TrimMethod(str1);
		}

	}

