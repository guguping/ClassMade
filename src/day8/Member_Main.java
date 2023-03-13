package day8;

import java.util.*;

public class Member_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Util util = new Util();
		List<Member> list = new ArrayList<>();
		int id = 0;

		while (true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.검색 4.멤버수정 5.멤버삭제 0.종료");
			System.out.println("메뉴 선택 >");
			int menu = util.numberCheck();

			if (menu == 1) {
				Member member = new Member();
				member.setId(++id); // ++id = 전치 증강 id++ = 후치증강 후치는 줄이 ;로 끝나면 증강
				System.out.println("이메일 입력 >");
				member.setEmail(sc.next());				
				list.add(member);
				System.out.println("비밀번호 입력 >");
				member.setPw(sc.next());
				System.out.println("이름 입력 >");
				member.setName(sc.next());
				System.out.println("멤버등록 성공!");

			} else if (menu == 2) {
				System.out.println("아이디\t이메일\t\t비밀번호\t이름\t가입일");
				System.out.println("-------------------------------------");
				for (Member mm : list) {
					mm.print();
				}

			} else if (menu == 3) {
				boolean find = false;
				System.out.println("검색 아이디 >");
				int searchId = sc.nextInt();
				System.out.println("아이디\t이메일\t\t비밀번호\t이름\t가입일");
				System.out.println("-------------------------------------");
				for (Member mm : list) {
					if (mm.getId() == searchId) {
						mm.print();
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("없는 아이디 입니다");
				}
			} else if (menu == 4) {
				boolean find = false;
				System.out.println("수정할 아이디 >");
				int updateId=sc.nextInt();
				for(Member mm : list) {
					if(updateId == mm.getId()) {
						System.out.println("수정할 이메일입력 >");
						mm.setEmail(sc.next());
						System.out.println("수정할 비밀번호입력 >");
						mm.setPw(sc.next());
						System.out.println("수정할 이름입력 >");
						mm.setName(sc.next());
						System.out.println("수정 완료!");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 id입니다");
				}
			} else if (menu == 5) {
				boolean find = false;
				System.out.println("삭제할 id >");
				int deleteId = sc.nextInt();
				for(Member mm : list) {
					if(deleteId == mm.getId()) {
						System.out.println(mm.getName()+"님 삭제 완료!");
						list.remove(mm);
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회 할 수 없는 id 입니다");
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("없는 메뉴");
			}
		}
		System.out.println("프로그램 종료");

	}

}
