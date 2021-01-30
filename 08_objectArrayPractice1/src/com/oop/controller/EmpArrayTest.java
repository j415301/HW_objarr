package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] ear = new Employee[3];
		ear[0] = new Employee();
		ear[1] = new Employee(201503,"�ڱ浿",29,'M',"010-1234-5678","��⵵ �����ν�");
		ear[2] = new Employee(201004,"��ö��","���ߺ�","����",34,'M',4500000,0.15,"010-2143-9876",
				"����� ����� ����� 123");
		for(int i=0 ; i<ear.length ; i++) {
			System.out.println(ear[i].empInformation());
		}
		System.out.println("-------------------------------------------------------");
		ear[0] = new Employee(201305,"�̿���","�ѹ���","�븮",28,'F',3750000,0.1,"010-9512-7534",
				"��⵵ ����õ");
		ear[1].setDept("��ȹ��");
		ear[1].setJob("���");
		ear[1].setSalary(2900000);
		ear[1].setBonusPoint(0.05);
		System.out.println(ear[0].empInformation());
		System.out.println(ear[1].empInformation());
		System.out.println("-------------------------------------------------------");
		int salary[] = new int[3];
		for(int i=0 ; i<ear.length ; i++) {
			salary[i] = (int)((ear[i].getSalary()+(ear[i].getSalary()*ear[i].getBonusPoint()))*12);
			System.out.println(ear[i].getEmpName()+"�� ���� : "+salary[i]);
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("�������� ������ ��� : "+(salary[0]+salary[1]+salary[2])/3);

	}
}
