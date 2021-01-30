package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sarr = new Student[5];
	//��ü ������ �޼ҵ� �ۿ��� �ؾ�������, ������ �ʱ�ȭ�ϰų� �׷��� ���ؼ��� �ʱ�ȭ ��, �żҵ� �� �ȿ� �� �־�� ��
	
	public StudentController() {
		// TODO Auto-generated constructor stub
		sarr[0] = new Student("��浿","�ڹ�",100);
		sarr[1] = new Student("�ڱ浿","���",50);
		sarr[2] = new Student("�̱浿","ȭ��",85);
		sarr[3] = new Student("���浿","����",60);
		sarr[4] = new Student("ȫ�浿","�ڹ�",20);
		
	}
	
	public Student[] studentInfo() {
		return sarr;
	}
	
	public void printStudnet() {
		for(int i=0 ; i<sarr.length ; i++) {
			System.out.println("�̸� : "+sarr[i].getName()+" / ���� : "+sarr[i].getSubject()+
					" / ���� : "+sarr[i].getScore());
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
				System.out.println(sarr[i].getName()+"�л��� ����Դϴ�.");
			} else {
				System.out.println(sarr[i].getName()+"�л��� ����� ����Դϴ�.");
			}
		}
	}
}
