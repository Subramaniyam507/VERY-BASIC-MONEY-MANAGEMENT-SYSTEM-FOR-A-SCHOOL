package com.MoneyManagementBasicForSchool.subbu;

/*
 ** this class keeps the record of the 
 * teacher's details like
 * id,name,salary 
 */
public class Teacher {
	private int iD;
	private String name;
	private int salary;
	private int salaryEarnedByTeacher;
/*constructor to initialize the teacher object
 * 
 * @param id
 * @param name
 * @param salary
 */
	public Teacher(int id,String name,int salary) {
		this.iD=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarnedByTeacher=0;
	}
	/*getter method
	 * returns the id of the teacher
	 */
	public int getTeachersid() {
		return this.iD;
	}
	/*getter method
	 * returns the name of the teacher
	 */
	public String getTeachersName() {
	 return this.name;
	}
	/*getter method
	 * returns the salary of the teacher
	 * 
	 */
	public int getTeachersSalary() {
		return salary;
	}
	/*sets the salary
	 * setter method
	 * @param salary
	 */
	public void setTeacherSalary(int salary) {
		this.salary=salary;
	}
	/**
	 * adds to the salary
	 * and removes money from the money earned by the school	
	 *  * @param salary
	 */
	
	public void receiveSalaryTeacher(int salary) {
		salaryEarnedByTeacher=salaryEarnedByTeacher+salary;
	School.updateTotalCashSpent(salary);
	}
	@Override
	public String toString() {     //can be done to teachers also
		return "Teacher's name:"+name+
				 "Total salary paid until now"+salaryEarnedByTeacher;
	}
}
