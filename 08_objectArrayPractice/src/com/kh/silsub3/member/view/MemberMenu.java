package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.model.vo.Member;

public class MemberMenu {
	//메뉴 화면 제공용 클래스
	
	 private Scanner sc = new Scanner(System.in);
	 private MemberManager mManager = new MemberManager();
	 private Member m = new Member();
	 
	 public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	 
	 public void mainMenu() {
		 while(true) {
			 System.out.println();
			 System.out.println("최대 등록 가능한 회원 수는 "+mManager.SIZE+"명입니다.");
			 System.out.println("현재 등록된 회원 수는 "+mManager.memberCount+"명입니다.");
			 System.out.println();
			 System.out.println("***** 회원 관리 프로그램 ****");
			 System.out.println("1. 새 회원 등록");
			 System.out.println("2. 회원 조회");
			 System.out.println("3. 회원 정보 수정");
			 System.out.println("4. 회원 정보 정렬");
			 System.out.println("5. 회원 삭제");
			 System.out.println("6. 모두 출력");
			 System.out.println("9. 끝내기");
			 System.out.print("메뉴 선택 : ");
			 int cho = sc.nextInt();
			 switch (cho) {
			 	case 1: mManager.memberInput(); break;
			 	case 2: searchMenu(); break;
			 	case 3: modifyMenu(); break;
			 	case 4: sortMenu(); break;
			 	case 5: mManager.deleteMember(); break;
			 	case 6: mManager.printAllMember(); break;
			 	case 9:
			 		System.out.println("정말로 끝내시겠습니까? (Y/N)");
			 		char finish = sc.next().charAt(0);
			 		if(finish=='Y') return;
			 }
		 }
	 }
	 
	 public void searchMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** 회원 정보 검색 메뉴 *****");
			 System.out.println("1. 아이디로 검색");
			 System.out.println("2. 이름으로 검색");
			 System.out.println("3. 이메일로 검색");
			 System.out.println("9. 이전 메뉴로 가기");
			 System.out.print("메뉴 선택 : ");
			 int cho = sc.nextInt();
			 int index = 0;
			 switch (cho) {
			 	case 1: 
			 		System.out.println("아이디를 입력하세요.");
					String id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		break;
			 	case 2 :
			 		System.out.println("이름을 입력하세요.");
					String name = sc.next();
			 		index = mManager.searchMemberName(name);
			 		break;
			 	case 3:
			 		System.out.println("이메일을 입력하세요.");
					String email = sc.next();
			 		index = mManager.searchMemberEmail(email);
			 		break;
			 	case 9:
			 		System.out.println("메인 메뉴로 화면 이동합니다.");
			 		return;
			 }
			 if (index>-1) {
				 mManager.printMember(index);
			 } else System.out.println("회원 정보가 존재하지 않습니다.");
		 }
	 }
	 
	 public void modifyMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** 회원 정보 수정 메뉴 *****");
			 System.out.println("1. 암호 변경");
			 System.out.println("2. 이메일 변경");
			 System.out.println("3. 나이 변경");
			 System.out.println("9. 이전 메뉴로 가기");
			 System.out.print("메뉴 선택 : ");
			 int cho = sc.nextInt();
			 int index = 0;
			 switch (cho) {
			 	case 1:
			 		System.out.print("변경할 회원의 아이디 : ");
			 		String id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("변경할 암호 : ");
				 		m.setPassword(sc.next());
				 		System.out.println("회원 정보가 변경되었습니다.");
			 		}
			 		break;
			 	case 2:
			 		System.out.print("변경할 회원의 아이디 : ");
			 		id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("변경할 이메일 주소 : ");
				 		m.setEmail(sc.next());
				 		System.out.println("회원 정보가 변경되었습니다.");
			 		}
			 		break;
			 	case 3:
			 		System.out.print("변경할 회원의 아이디 : ");
			 		id = sc.next();
			 		index = mManager.searchMemberId(id);
			 		if (index!=-1) {
			 			System.out.print("변경할 나이 : ");
				 		m.setAge(sc.nextInt());
				 		System.out.println("회원 정보가 변경되었습니다.");
			 		}
			 		break;
			 	case 9:
			 		System.out.println("메인 메뉴로 화면 이동합니다.");
			 		return;
			 }
		 }
	 }
	 
	 public void sortMenu() {
		 while (true) {
			 System.out.println();
			 System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
			 System.out.println("1. 아이디 오름차순 정렬 출력");
			 System.out.println("2. 아이디 내림차순 정렬 출력");
			 System.out.println("3. 나이 오름차순 정렬 출력");
			 System.out.println("4. 나이 내림차순 정렬 출력");
			 System.out.println("5. 성별 내림차순 정렬 출력 (남여순)");
			 System.out.println("9. 이전 메뉴로 가기");
			 System.out.print("메뉴 선택 : ");
			 int cho = sc.nextInt();
			 switch (cho) {
			 	case 1: mManager.sortIDAsc(); mManager.printAllMember(); break;
			 	case 2: mManager.sortIDDes(); mManager.printAllMember(); break;
			 	case 3: mManager.sortAgeAsc(); mManager.printAllMember(); break;
			 	case 4: mManager.sortAgeDes(); mManager.printAllMember(); break;
			 	case 5: mManager.sortGenderDes(); mManager.printAllMember(); break;
			 	case 9:
			 		System.out.println("메인 메뉴로 화면 이동합니다.");
			 		return;
			 }
		 }
	 }	 
}