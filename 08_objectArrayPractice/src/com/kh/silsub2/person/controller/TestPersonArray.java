package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] p = new Person[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<p.length ; i++) {
			System.out.println("==== 1¹ø ====");
			p[i] = new Person();
			System.out.print("ÀÌ¸§ : ");
			p[i].setName(sc.next());
			System.out.print("³ªÀÌ : ");
			p[i].setAge(sc.nextInt());
			System.out.print("Å° : ");
			p[i].setHeight(sc.nextDouble());
			System.out.print("¸ö¹«°Ô : ");
			p[i].setWeight(sc.nextDouble());
		}
		
		System.out.println("===== ³ªÀÌ/Å°/¸ö¹«°Ô Æò±Õ =====");
		double age = 0;
		for(int i=0 ; i<p.length ; i++) {
			age += p[i].getAge();
		}
		System.out.println("³ªÀÌ Æò±Õ : "+age/p.length);
		double height = 0.0;
		for(int i=0 ; i<p.length ; i++) {
			height += p[i].getHeight();
		}
		System.out.println("Å° Æò±Õ : "+height/p.length);
		double weight = 0.0;
		for(int i=0 ; i<p.length ; i++) {
			weight += p[i].getWeight();
		}
		System.out.println("¸ö¹«°Ô Æò±Õ : "+weight/p.length);

	}

}
