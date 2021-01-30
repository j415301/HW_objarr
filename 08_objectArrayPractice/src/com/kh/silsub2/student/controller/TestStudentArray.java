package com.kh.silsub2.student.controller;

import java.util.Scanner;

import com.kh.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[10];
		
		int count = 1;
		while (true) {
			for(int i=0 ; i<s.length ; i++) {
				s[i] = new Student();
				System.out.println("===== "+(i+1)+"번째 학생 =====");
				System.out.print("학년 : ");
				s[i].setGrade(sc.nextInt());
				System.out.print("반 : ");
				s[i].setGroup(sc.nextInt());
				System.out.print("이름 : ");
				s[i].setName(sc.next());
				System.out.print("국어점수 : ");
				s[i].setKor(sc.nextInt());
				System.out.print("영어점수 : ");
				s[i].setEng(sc.nextInt());
				System.out.print("수학점수 : ");
				s[i].setMath(sc.nextInt());
				System.out.println("계속 추가하시겠습니까? (Y/N)");
				char yesno = sc.next().charAt(0);
				if (yesno=='Y' || yesno=='y') {
					count++;
					continue;
				}
				else break;
			}
			break;
		}
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		for (int i=0 ; i<count ; i++) {
			korTotal += s[i].getKor();
			engTotal += s[i].getEng();
			mathTotal += s[i].getMath();
		}
		
		System.out.println("국어 평균 : "+(double)korTotal/count);
		System.out.println("영어 평균 : "+(double)engTotal/count);
		System.out.println("수학 평균 : "+(double)mathTotal/count);
		
		for (int i=0 ; i<count ; i++) {
			System.out.println(s[i].printInfo());
		}
		
	}
}
