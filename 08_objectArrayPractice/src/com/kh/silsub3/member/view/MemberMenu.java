package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.model.vo.Member;

public class MemberMenu {
	//�޴� ȭ�� ������ Ŭ����
	
	 private Scanner sc = new Scanner(System.in);
	 private MemberManager mManager = new MemberManager();
	 private Member m = new Member();
	 
	 public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	 
	 public void mainMenu() {
		 while(true) {
			 System.out.println();
			 System.out.println("�ִ� ��� ������ ȸ�� ���� "+mManager.SIZE+"���Դϴ�.");
			 System.out.println("���� ��ϵ� ȸ�� ���� "+mManager.memberCount+"���Դϴ�.");
			 System.out.println();
			 System.out.println("***** ȸ�� ���� ���α׷� ****");
			 System.out.println("1. �� ȸ�� ���");
			 System.out.println("2. ȸ�� ��ȸ");
			 System.out.println("3. ȸ�� ���� ����");
			 System.out.println("4. ȸ�� ���� ����");
			 System.out.println("5. ȸ�� ����");
			 System.out.println("6. ��� ���");
			 System.out.println("9. ������");
			 System.out.print("�޴� ���� : ");
			 int cho = sc.nextInt();
			 switch (cho) {
			 	case 1: mManager.memberInput(); break;
			 	case 2: searchMenu(); break;
			 	case 3: modifyMenu(); break;
			 	case 4: sortMenu(); break;
			 	case 5: mManager.deleteMember(); break;
			 	case 6: mManager.printAllMember(); break;
			 	case 9:
			 		System.out.println("������ �����ðڽ��ϱ�? (Y/N)");
			 		char finish = sc.next().charAt(0);
			 		if(finish=='Y') return;
			 }
		 }
	 }
	 
	 public void searchMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** ȸ�� ���� �˻� �޴� *****");
			 System.out.println("1. ���̵�� �˻�");
			 System.out.println("2. �̸����� �˻�");
			 System.out.println("3. �̸��Ϸ� �˻�");
			 System.out.println("9. ���� �޴��� ����");
			 System.out.print("�޴� ���� : ");
			 int cho = sc.nextInt();
			 int index = 0;
			 switch (cho) {
			 	case 1: 
			 		System.out.println("���̵� �Է��ϼ���.");
					String id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		break;
			 	case 2 :
			 		System.out.println("�̸��� �Է��ϼ���.");
					String name = sc.next();
			 		index = mManager.searchMemberName(name);
			 		break;
			 	case 3:
			 		System.out.println("�̸����� �Է��ϼ���.");
					String email = sc.next();
			 		index = mManager.searchMemberEmail(email);
			 		break;
			 	case 9:
			 		System.out.println("���� �޴��� ȭ�� �̵��մϴ�.");
			 		return;
			 }
			 if (index>-1) {
				 mManager.printMember(index);
			 } else System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
		 }
	 }
	 
	 public void modifyMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** ȸ�� ���� ���� �޴� *****");
			 System.out.println("1. ��ȣ ����");
			 System.out.println("2. �̸��� ����");
			 System.out.println("3. ���� ����");
			 System.out.println("9. ���� �޴��� ����");
			 System.out.print("�޴� ���� : ");
			 int cho = sc.nextInt();
			 int index = 0;
			 switch (cho) {
			 	case 1:
			 		System.out.print("������ ȸ���� ���̵� : ");
			 		String id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("������ ��ȣ : ");
				 		m.setPassword(sc.next());
				 		System.out.println("ȸ�� ������ ����Ǿ����ϴ�.");
			 		}
			 		break;
			 	case 2:
			 		System.out.print("������ ȸ���� ���̵� : ");
			 		id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("������ �̸��� �ּ� : ");
				 		m.setEmail(sc.next());
				 		System.out.println("ȸ�� ������ ����Ǿ����ϴ�.");
			 		}
			 		break;
			 	case 3:
			 		System.out.print("������ ȸ���� ���̵� : ");
			 		id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("������ ���� : ");
				 		m.setAge(sc.nextInt());
				 		System.out.println("ȸ�� ������ ����Ǿ����ϴ�.");
			 		}
			 		break;
			 	case 9:
			 		System.out.println("���� �޴��� ȭ�� �̵��մϴ�.");
			 		return;
			 }
		 }
	 }
	 
	 public void sortMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** ȸ�� ���� ���� ��� �޴� *****");
			 System.out.println("1. ���̵� �������� ���� ���");
			 System.out.println("2. ���̵� �������� ���� ���");
			 System.out.println("3. ���� �������� ���� ���");
			 System.out.println("4. ���� �������� ���� ���");
			 System.out.println("5. ���� �������� ���� ��� (������)");
			 System.out.println("9. ���� �޴��� ����");
			 System.out.print("�޴� ���� : ");
			 int cho = sc.nextInt();
			 switch (cho) {
			 	case 1: mManager.sortIDAsc(); mManager.printAllMember(); break;
			 	case 2: mManager.sortIDDes(); mManager.printAllMember(); break;
			 	case 3: mManager.sortAgeAsc(); mManager.printAllMember(); break;
			 	case 4: mManager.sortAgeDes(); mManager.printAllMember(); break;
			 	case 5: mManager.sortGenderDes(); mManager.printAllMember(); break;
			 	case 9:
			 		System.out.println("���� �޴��� ȭ�� �̵��մϴ�.");
			 		return;
			 }
		 }
	 }	 
}