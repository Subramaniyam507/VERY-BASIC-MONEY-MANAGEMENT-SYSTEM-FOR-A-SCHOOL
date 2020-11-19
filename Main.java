package com.MoneyManagementBasicForSchool.subbu;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher Subramaniyam= new Teacher(1,"Subramaniyam",6500); 
		Teacher Gowtham = new Teacher(2,"Gowtham",8500); 
		Teacher SreeLal = new Teacher(3,"SreeLal",10000);
		Teacher Vaishali = new Teacher(4,"Vaishali",12000);
		Teacher Rajesh = new Teacher(5,"Rajesh",14000);
		Teacher Gayathri = new Teacher(6,"Gayathri",16000);
		
		List<Teacher> teacherList = new ArrayList<>();
		
		teacherList.add(Subramaniyam);
		teacherList.add(Gowtham);
		teacherList.add(SreeLal);
		teacherList.add(Vaishali);
		teacherList.add(Rajesh);
		teacherList.add(Gayathri);
		
		Student MadhusudhanaReddy= new Student(1,"MadusudhanaReddy",1);
		Student Bhagavathi= new Student(1,"Bhagavathi",2); 
		Student Gururaj= new Student(1,"Gururaj",3);
		Student Nandini= new Student(1,"Nandini",4);
		
		List<Student> studentList= new ArrayList<>();
		studentList.add(MadhusudhanaReddy);
		studentList.add(Bhagavathi);
		studentList.add(Gururaj);
		studentList.add(Nandini);
		School TheOxfordCollegeofEngineering = new School(teacherList,studentList);
		
		MadhusudhanaReddy.payFees(100000);
		Bhagavathi.payFees(100000);
		Gururaj.payFees(19000);
		Nandini.payFees(98000);
		
		System.out.println("TheOxfordCollegeofEngineering has Rs"+ TheOxfordCollegeofEngineering.TotalCashEarned());
		
		Subramaniyam.receiveSalaryTeacher(Subramaniyam.getTeachersSalary());
		System.out.println("The Oxford College of Engineering has spent for salary to"+Subramaniyam.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
		
		Gowtham.receiveSalaryTeacher(Gowtham.getTeachersSalary());
		
		System.out.println("The Oxford College of Engineering has spent for salary to"+Gowtham.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
		
		SreeLal.receiveSalaryTeacher(SreeLal.getTeachersSalary());
		
		System.out.println("The Oxford College of Engineering has spent for salary to"+SreeLal.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
		
		
		Vaishali.receiveSalaryTeacher( Vaishali.getTeachersSalary());
		
		System.out.println("The Oxford College of Engineering has spent for salary to"+Vaishali.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
		
		 
		Rajesh.receiveSalaryTeacher(Rajesh.getTeachersSalary());
		
		System.out.println("The Oxford College of Engineering has spent for salary to"+Rajesh.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
		
		Gayathri.receiveSalaryTeacher(Gayathri.getTeachersSalary());
		
		System.out.println("The Oxford College of Engineering has spent for salary to"+Gayathri.getTeachersName()
		+"and now has Rs"+TheOxfordCollegeofEngineering.TotalCashEarned());
	
		System.out.println(MadhusudhanaReddy);
		System.out.println(Bhagavathi);
		System.out.println(Gururaj);
		System.out.println(Nandini);
		
		System.out.println(Subramaniyam);
		System.out.println(Gowtham);
		System.out.println(SreeLal);
		System.out.println(Vaishali);
		System.out.println(Rajesh);
		System.out.println(Gayathri);
		
		
		
	}
	

}
