package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sarr = new Student[5];
	//객체 선언은 메소드 밖에서 해야하지만, 변수를 초기화하거나 그러기 위해서는 초기화 블럭, 매소드 등 안에 들어가 있어야 함
	
	public StudentController() {
		// TODO Auto-generated constructor stub
		sarr[0] = new Student("김길동","자바",100);
		sarr[1] = new Student("박길동","디비",50);
		sarr[2] = new Student("이길동","화면",85);
		sarr[3] = new Student("정길동","서버",60);
		sarr[4] = new Student("홍길동","자바",20);
		
	}
	
	public Student[] studentInfo() {
		return sarr;
	}
	
	public void printStudnet() {
		for(int i=0 ; i<sarr.length ; i++) {
			System.out.println("이름 : "+sarr[i].getName()+" / 과목 : "+sarr[i].getSubject()+
					" / 점수 : "+sarr[i].getScore());
		}
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0 ; i<sarr.length ; i++) {
			sum+=sarr[i].getScore();
		}
		return sum;
	}
	
	public double avgScore() {
		double[] avgarr = new double[2];
		avgarr[0] = sumScore();
		avgarr[1] = sumScore()/5.0;
		return avgarr[1];
	}
	
	public int CUT_LINE() {
		return 60;
	}
	
	public void printScoreResult() {
		for(int i=0 ; i<sarr.length ; i++) {
			if(sarr[i].getScore()>=CUT_LINE()) {
				System.out.println(sarr[i].getName()+"학생은 통과입니다.");
			} else {
				System.out.println(sarr[i].getName()+"학생은 재시험 대상입니다.");
			}
		}
	}
}
