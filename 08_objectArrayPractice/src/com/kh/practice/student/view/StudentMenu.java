package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu{
	
	
//	private Student[] students = new Student[5];
	
	public StudentMenu() {
		// TODO Auto-generated constructor stub
		
		Student s = new Student();
		StudentController sc = new StudentController();
//		System.out.println(sc.studentInfo());
		
		System.out.println("========== �л� ���� ��� ==========");
		sc.printStudnet();
		System.out.println();
		
		System.out.println("========== �л� ���� ��� ==========");
		System.out.println("�л� ���� �հ� : "+sc.sumScore());
		System.out.println("�л� ���� ��� : "+sc.avgScore());
		System.out.println();
		
		System.out.println("========== ���� ��� ��� ==========");
		sc.printScoreResult();
		
	}
	
	

}
