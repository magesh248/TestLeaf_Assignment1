package org.student;

import org.department.Department;

public class Student extends Department {

	public void	studentName() {
		System.out.println("Mageshwar V");
	}

	public void	studentDept() {
		System.out.println("IT");
	}


	public void	studentId() {
		System.out.println("2224436");
	}
	
	public static void main(String[] args) {
		
		Student obj =new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}
}

