package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] p = new Person[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<p.length ; i++) {
			System.out.println("==== 1�� ====");
			p[i] = new Person();
			System.out.print("�̸� : ");
			p[i].setName(sc.next());
			System.out.print("���� : ");
			p[i].setAge(sc.nextInt());
			System.out.print("Ű : ");
			p[i].setHeight(sc.nextDouble());
			System.out.print("������ : ");
			p[i].setWeight(sc.nextDouble());
		}
		
		System.out.println("===== ����/Ű/������ ��� =====");
		double age = 0;
		for(int i=0 ; i<p.length ; i++) {
			age += p[i].getAge();
		}
		System.out.println("���� ��� : "+age/p.length);
		double height = 0.0;
		for(int i=0 ; i<p.length ; i++) {
			height += p[i].getHeight();
		}
		System.out.println("Ű ��� : "+height/p.length);
		double weight = 0.0;
		for(int i=0 ; i<p.length ; i++) {
			weight += p[i].getWeight();
		}
		System.out.println("������ ��� : "+weight/p.length);

	}

}
