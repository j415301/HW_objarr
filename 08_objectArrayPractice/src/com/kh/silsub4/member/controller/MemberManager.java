package com.kh.silsub4.member.controller;

import java.util.Scanner;

import com.kh.silsub4.member.model.vo.Member;

public class MemberManager {
	//ȸ�� ������ ���α׷� �޴�
	
	private static Member[] m = new Member[10];
	private static int ctn = 0;//ȸ�� �� üũ�� ����
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertMember() {
		for (int i=0 ; i<m.length ; i++) {
			if (m[i]==null) {
				m[i] = new Member();
				System.out.print("���̵� : ");
				m[i].setUserId(sc.next());
				System.out.print("�н����� : ");
				m[i].setUserPwd(sc.next());
				System.out.print("�̸� : ");
				m[i].setUserName(sc.next());
				System.out.print("���� : ");
				m[i].setAge(sc.nextInt());
				System.out.print("����(M/W) : ");
				m[i].setGender(sc.next().charAt(0));
				System.out.print("�̸��� : ");
				m[i].setEmail(sc.next());
				ctn++;
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
				break;
			}
		}
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "�˻��� �Ϸ�Ǿ����ϴ�." : "�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserName().equals(name)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "�˻��� �Ϸ�Ǿ����ϴ�." : "�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getEmail().equals(email)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "�˻��� �Ϸ�Ǿ����ϴ�." : "�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
	}
	
	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
				m[i].setUserPwd(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "�н����� ������ �Ϸ�Ǿ����ϴ�." : "������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("������ �̸��� �Է��ϼ���.");
				m[i].setUserName(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "�̸� ������ �Ϸ�Ǿ����ϴ�." : "������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("������ �̸����� �Է��ϼ���.");
				m[i].setEmail(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "�̸��� ������ �Ϸ�Ǿ����ϴ�." : "������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				m[i] = null;
				for (int j=i ; j<ctn-1 ; j++) {
					m[j] = m[j+1];
				}
				flag = true;
				ctn--;
				break;
			}
		}
		System.out.println(flag? "�����Ǿ����ϴ�." : "������ ȸ���� �������� �ʽ��ϴ�.");
	}
	
	public void deleteAll() {
		for (int i=0 ; i<ctn ; i++) {
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender('0');
			m[i].setEmail(null);
		}
		ctn = 0;
	}
	
	public void printAllMember() {
		for (int i=0 ; i<ctn ; i++) {
			System.out.println(m[i].getUserId()+" "+m[i].getUserPwd()+" "+m[i].getUserName()+" "+
					m[i].getAge()+" "+m[i].getGender()+" "+m[i].getEmail());
		}
	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId()+" "+m.getUserPwd()+" "+m.getUserName()+" "+m.getAge()+" "+
				m.getGender()+" "+m.getEmail());
	}

}
