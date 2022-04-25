package com.org.genp.day8;

import java.util.Comparator;
public class DateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getDateOfJoining().compareTo(o2.getDateOfJoining())>0) {
			return -1  ;
		}
		else if(o1.getDateOfJoining().compareTo(o2.getDateOfJoining())<0) {
			return 1  ;
		}
		else
			return 0;
		
	}

}