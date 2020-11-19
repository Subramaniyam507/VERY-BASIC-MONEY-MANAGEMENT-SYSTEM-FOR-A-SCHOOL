package com.MoneyManagementBasicForSchool.subbu;

import java.util.List;
/**
 * we need array list
 * for students and teachers
 * due to its dynamic allocation property. 
 * @author s
 *
 */

public class School {
	private List<Teacher> teachers;
    private List <Student >students;
    private static int totalCashEarned;
    private static int totalCashSpent;
    
    /*constructor for school 
     * when school object is created both list will be passed
     * school would have earned or spent rs 0 when school is created
     */
    public School (List<Teacher> teachers,List <Student >students) {
    	this.students =students;
    	this.teachers = teachers;
    	totalCashEarned=0;
    	totalCashSpent=0;
    }

    /*
     * @return list of teacher
     */
	public List<Teacher> getTeachers() {
		return teachers;
	}
/*
 * @param teacher
 * adds a new teacher in case some one joins the school
 */
	public void addNewTeachers(Teacher teacher) {
	teachers.add(teacher);	
	}
	/*
	 * @return list of student
	 */

	public List<Student> getStudents() {
		return students;
	}
	/*
	 * adds new students
	 * @param student
	 */

	public void addNewStudents(Student student) {
		students.add(student);
	}
	/*
	 * @return totalCashEarned
	 */

	public int TotalCashEarned() {
		return totalCashEarned;
	}
/*
 * adds money to the cash earned by the school when fees is paid
 * @param feespaidtoschool
 */
	public static void updateTotalCashEarned(int feespaidtoschool ) {
		totalCashEarned = totalCashEarned + feespaidtoschool ;
	}
	/*
	 * @return total amount spent by the school
	 */

	public int getTotalCashSpent() {
		return totalCashSpent;
	}
/*keeps the record of money spend by the school
 * @param cashToTeachers which is salary to teachers
 */
	public static void updateTotalCashSpent(int cashToTeachers) {
		totalCashEarned=totalCashEarned-cashToTeachers;
	}
    
    
}
