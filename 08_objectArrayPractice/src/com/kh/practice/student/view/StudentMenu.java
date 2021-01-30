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
		
		System.out.println("========== 학생 정보 출력 ==========");
		sc.printStudnet();
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : "+sc.sumScore());
		System.out.println("학생 점수 평균 : "+sc.avgScore());
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		sc.printScoreResult();
		
	}
	
	

}
