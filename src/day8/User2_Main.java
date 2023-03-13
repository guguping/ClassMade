package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Util2 util2 = new Util2();
		List<User2> list = new ArrayList<>();
		boolean login = false;
		int loginIndex = -1;
		User2 loginUser = new User2();

		while (true) {
			if (login == false) {
				System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			} else if (login == true) {
				System.out.println("1.비밀번호 수정 2.로그아웃 3.리스트 4.회원탈퇴 0.종료");
			}
			System.out.println("메뉴 선택>");
			int menu = util2.menuCheck();

			if (menu == 1) {
				if (login == true) {
					System.out.println("비밀번호 확인");
					int pw2 = sc.nextInt();
				} else {
					User2 user2 = new User2();
					System.out.println("이름 입력 >");
					user2.setName(sc.next());
					System.out.println("아이디 입력 >");
					user2.setId(list,4);
					System.out.println("비밀번호 입력 >");
					user2.setPw(sc.next());
					list.add(user2);
					System.out.println("반갑습니다" + user2.getName() + "님 회원가입 완료");
				}
			} else if (menu == 2) {
				if (login == true) {
					login = false;
				} else {
					System.out.println("로그인할 아이디 >");
					String loginId = sc.next();
					System.out.println("로그인할 비밀번호 >");
					String loginPw = sc.next();

					boolean find = false;
					for (User2 mm : list) {
						if (loginId.equals(mm.getId()) && loginPw.equals(mm.getPw())) {
							System.out.println(mm.getName() + "님 로그인 성공!");
							login = true;
							find = true;
							break;
						}
					}
					if (!find) {
						System.out.println("로그인 실패!");
					}
				}
			} else if (menu == 3) {
				if (login == true) {

				} else {
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("------------------------------");
					for (User2 mm : list) {
						mm.print();
					}
				}
			} else if (login == true) {

			} else if (menu == 0) {
				break;
			}
		}
		System.out.println("없는 메뉴 입니다");
	}

}
