package com.MoneyManagementBasicForSchool.subbu;
/**
 * this a class that handles the students
 * ID
 * GRADE
 * FEES TO BE PAID
 * FEES PAID BY THE STUDENT
 * NAME OF THE STUDENT
 * @author s
 *
 */
public class Student {
	private int iD;
	private String name;
	private int grade;
	private int feespaid;
	private int feestobepaid;
/**constructor to create a student object by initializing  the object.
 *@param id 
 *@param name   
 *@param grade 
 *fees that has to be paid by the student is Rs 1,00,000 per year
 *fees initially paid is Rs 0.
 */

	
public Student(int id, String name,int grade) {
	this.feespaid=0;
	this.feestobepaid=100000;
	this.iD=id;
	this.name=name;
	this.grade=grade;
}
/*
 * 
 * @return id of the student
 * 
 */
public int getStudentsId() {
	return this.iD;
}
/*@returns student's name
 * 
 */
public String getStudentsName() {
	return this.name;
	
}
/*@return students grade
 * 
 */
public int getStudentsGrade() {
	return this.grade;
}
/*
 *@return  the fees paid by the student
 */
public int getStudentsFeesPaid() {
	return this.feespaid;
}
/**
 * 
 * @return fees to be paid
 */
public int getStudentsTotalFeesToBePaid (){
	return this.feestobepaid;
}
/** students get promoted
 * so this method will accept the 
 * new grade of the student
 * 
 * @param grade
 */
public void setGrade(int grade) {
	this.grade=grade;
}
/**
 * this method keep the record of how much 
 * fees a student pays even if it is in installments
 * @param fees
 */
public void payFees(int fees) {
	feespaid=feespaid+fees;
	School.updateTotalCashEarned(feespaid);
}
/*
 * @return remaining fees
 */
public int getRemainingFees() {
	return feestobepaid-feespaid;
}
@Override
public String toString() {     //can be done to teachers also
	return "Student's name:"+name+
			 "Total fees paid until now"+feespaid;
			 
}


}
