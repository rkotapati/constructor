package com.BACI.Constructors;

public class Employee {
	
	public static void main(String[] args) {
		Employee e= new Employee ("Rao","padidela");
		
		
	}
		public Employee (String name) {
			System.out.println(name);
		}	
			
		public Employee (String fname , String lname) {
			this ("Sridhar");
			System.out.println(fname);
			System.out.println(lname);
		}	

	
}
