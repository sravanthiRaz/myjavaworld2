package com.sravanthi.java;
public interface EmployeeData {
	public void create(int id, String Name, String Address,double salary);
	public boolean update(int empNo, double newSal);
	public String delete(String empName);
	public void getEmp(double salary);

}
