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
				System.out.println("===== "+(i+1)+"��° �л� =====");
				System.out.print("�г� : ");
				s[i].setGrade(sc.nextInt());
				System.out.print("�� : ");
				s[i].setGroup(sc.nextInt());
				System.out.print("�̸� : ");
				s[i].setName(sc.next());
				System.out.print("�������� : ");
				s[i].setKor(sc.nextInt());
				System.out.print("�������� : ");
				s[i].setEng(sc.nextInt());
				System.out.print("�������� : ");
				s[i].setMath(sc.nextInt());
				System.out.println("��� �߰��Ͻðڽ��ϱ�? (Y/N)");
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
		
		System.out.println("���� ��� : "+(double)korTotal/count);
		System.out.println("���� ��� : "+(double)engTotal/count);
		System.out.println("���� ��� : "+(double)mathTotal/count);
		
		for (int i=0 ; i<count ; i++) {
			System.out.println(s[i].printInfo());
		}
		
	}
}
