package org.student;
import org.department.*;

public class Student extends Department  {
	public void studentName() {
		System.out.println("Abirami");
		}
	public void studentdept() {
		System.out.println("Ece");
	}
	public void studentId() {
		System.out.println("EC14002");
		}
	public static void main(String[] args) {
		Student sdn = new Student();
		sdn. studentName();
		sdn.studentdept();
		sdn.studentId();
		Department dept = new Department();
		dept.deptname();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		
		
		
		
	}

}
