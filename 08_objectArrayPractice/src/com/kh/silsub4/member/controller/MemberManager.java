package com.kh.silsub4.member.controller;

import java.util.Scanner;

import com.kh.silsub4.member.model.vo.Member;

public class MemberManager {
	//회원 관리용 프로그램 메뉴
	
	private static Member[] m = new Member[10];
	private static int ctn = 0;//회원 수 체크용 변수
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertMember() {
		for (int i=0 ; i<m.length ; i++) {
			if (m[i]==null) {
				m[i] = new Member();
				System.out.print("아이디 : ");
				m[i].setUserId(sc.next());
				System.out.print("패스워드 : ");
				m[i].setUserPwd(sc.next());
				System.out.print("이름 : ");
				m[i].setUserName(sc.next());
				System.out.print("나이 : ");
				m[i].setAge(sc.nextInt());
				System.out.print("성별(M/W) : ");
				m[i].setGender(sc.next().charAt(0));
				System.out.print("이메일 : ");
				m[i].setEmail(sc.next());
				ctn++;
				System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "검색이 완료되었습니다." : "검색한 회원 정보가 존재하지 않습니다.");
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserName().equals(name)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "검색이 완료되었습니다." : "검색한 회원 정보가 존재하지 않습니다.");
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getEmail().equals(email)) {
				printOne(m[i]);
				flag = true;
				break;
			}
		}
		System.out.println(flag? "검색이 완료되었습니다." : "검색한 회원 정보가 존재하지 않습니다.");
	}
	
	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("변경할 비밀번호를 입력하세요.");
				m[i].setUserPwd(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "패스워드 수정이 완료되었습니다." : "수정할 회원이 존재하지 않습니다.");
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("변경할 이름을 입력하세요.");
				m[i].setUserName(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "이름 수정이 완료되었습니다." : "수정할 회원이 존재하지 않습니다.");
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		boolean flag = false;
		for (int i=0 ; i<ctn ; i++) {
			if (m[i].getUserId().equals(id)) {
				System.out.println("변경할 이메일을 입력하세요.");
				m[i].setEmail(sc.next());
				flag = true;
			}
		}
		System.out.println(flag? "이메일 수정이 완료되었습니다." : "수정할 회원이 존재하지 않습니다.");
	}
	
	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
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
		System.out.println(flag? "삭제되었습니다." : "삭제할 회원이 존재하지 않습니다.");
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
