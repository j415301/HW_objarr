package com.kh.silsub3.member.controller;

import java.util.Scanner;

import com.kh.silsub3.member.model.vo.Member;

public class MemberManager {
	
	public MemberManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static final int SIZE = 10;
	private Member m;
	public int memberCount = 0;
	private Member[] marr = new Member[SIZE];
	private Scanner sc = new Scanner(System.in);
	
	public void memberInput() {
		System.out.println("새 회원을 등록합니다.");
		for(int i=0 ; i<marr.length ; i++) {
			if(marr[i]==null) {
				marr[i] = new Member();
				System.out.print("이름 : ");
				marr[i].setName(sc.next());
				System.out.print("아이디 : ");
				marr[i].setId(sc.next());
				System.out.print("비밀번호 : ");
				marr[i].setPassword(sc.next());
				System.out.print("이메일주소 : ");
				marr[i].setEmail(sc.next());
				System.out.print("성별(M/W) : ");
				marr[i].setGender(sc.next().charAt(0));
				System.out.print("나이 : ");
				marr[i].setAge(sc.nextInt());
				memberCount++;
			}
			System.out.println("계속 등록하시겠습니까? (Y/N)");
			char cho = sc.next().charAt(0);
			if (cho=='N') break;
		}
	}
	
	public int searchMemberId (String id) {
		for (int i=0 ; i<memberCount ; i++) {
			if(id.equals(marr[i].getId())) {
				return i;
			} continue;
		}
		return -1;
	}
	
	public int searchMemberName (String name) {
		for (int i=0 ; i<memberCount ; i++) {
			if(name.equals(marr[i].getName())) {
				return i;
			} continue;
		}
		return -1;
	}
	
	public int searchMemberEmail (String email) {
		for (int i=0 ; i<memberCount ; i++) {
			if(email.equals(marr[i].getEmail())) {
				return i;
			} continue;
		}
		return -1;
	}
	
	public void printMember(int i) {
		System.out.println(marr[i].memberInfo());
	}
	
	public void printAllMember() {
		for(int i=0 ; i<memberCount ; i++) {
			System.out.println(marr[i].getName()+" "+marr[i].getId()+" "+
					marr[i].getPassword()+" "+marr[i].getEmail()+" "+marr[i].getGender()
					+" "+marr[i].getAge());
		}
	}
	
	public void sortIDAsc() {
		for (int i=0 ; i<memberCount ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(marr[i].getId().compareTo(marr[j].getId())<0) {
					Member[] t = new Member[1];
					t[0] = marr[i];
					marr[i] = marr[j];
					marr[j] = t[0];
				}
			}
		}
	}
	
	public void sortIDDes() {
		for (int i=0 ; i<memberCount ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(marr[i].getId().compareTo(marr[j].getId())>0) {
					Member[] t = new Member[1];
					t[0] = marr[i];
					marr[i] = marr[j];
					marr[j] = t[0];
				}
			}
		}
	}
	
	public void sortAgeAsc() {
		for (int i=0 ; i<memberCount ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(marr[i].getAge()<marr[j].getAge()) {
					Member[] t = new Member[1];
					t[0] = marr[i];
					marr[i] = marr[j];
					marr[j] = t[0];
				}
			}
		}
	}
	
	public void sortAgeDes() {
		for (int i=0 ; i<memberCount ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(marr[i].getAge()>marr[j].getAge()) {
					Member[] t = new Member[1];
					t[0] = marr[i];
					marr[i] = marr[j];
					marr[j] = t[0];
				}
			}
		}
	}
	
	public void sortGenderDes() {
		for (int i=0 ; i<memberCount ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(marr[i].getGender()=='M' && marr[j].getGender()=='W') {
					Member[] t = new Member[1];
					t[0] = marr[i];
					marr[i] = marr[j];
					marr[j] = t[0];
				}
			}
		}
	}
	
	public void deleteMember() {
		System.out.println("삭제할 회원명을 입력하세요.");
		String name = sc.next();
		boolean flag = false;
		for (int i=0 ; i<memberCount ; i++) {
			if (marr[i].getName().equals(name)) {
				marr[i] = null;
				for (int j=i ; j<memberCount-1 ; j++) {
					marr[j] = marr[j+1];
				}
				memberCount--;
				flag = true;
				break;
			}
		}
		System.out.println(flag? "삭제되었습니다." : "해당하는 이름의 회원이 없습니다.");
	}
}