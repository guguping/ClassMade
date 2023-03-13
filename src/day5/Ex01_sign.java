package day5;

import java.util.Scanner;

public class Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name = "guping";
		String id = "guping";
		String pw = "1234";
		boolean run = true;
		boolean run1 = false;
		boolean run2 = false;

		while (run) {
			while (run1) {
				System.out.println("1.비밀번호 변경 2.로그아웃");
				String loginmenu = sc.next();
				run2=true;
				while (run2) {
					if (loginmenu.equals("1")) {
						System.out.print("비밀번호 확인>");
						String pw1 = sc.next();
						if (pw.equals(pw1)) {
							System.out.print("변경 할 비밀번호 입력>");
							String pw2 = sc.next();
							
							if (pw2.equals(pw)) {
								System.out.println("같은 비밀번호로 변경 불가!\n");
								continue;
							} else if (pw2.equals(pw2)) {
								System.out.print("변경 할 비밀번호 확인>");
								String pw3 = sc.next();
								if(!(pw3.equals(pw2))) {
									System.out.println("변경 할 비밀번호를 확인해주세요\n");
									continue;
								}else {
								System.out.println(name+"님 비밀번호 변경 성공!\n다시 로그인해주세요");
								pw = pw3;
								run2 = false;
								run1 = false;
								}
								
							}
							
						} else if (!(pw.equals(pw1))) {
							System.out.println("비밀 번호가 틀립니다");
							continue;
						}
						run2 = false;
					} else if (loginmenu.equals("2")) {
						System.out.println(name + "님 로그아웃 성공!");
						run2 = false;
						run1 = false;
					
					}
				}
			}
			System.out.println("====회원 가입====");
			System.out.println("1.회원가입 2.로그인 3.종료");
			System.out.print("메뉴 입력>");
			String menu = sc.next();

			if (menu.equals("1")) {
				System.out.print("이름 입력>");
				name = sc.next();
				System.out.print("아이디 입력>");
				id = sc.next();
				System.out.print("비밀번호 입력>");
				pw = sc.next();

				System.out.println(name + "님 회원가입을 환영합니다!");
			} else if (menu.equals("2")) {
				System.out.print("아이디 입력>");
				String loginid = sc.next();
				System.out.print("비밀번호 입력>");
				String loginpw = sc.next();

				if (loginid.equals(id) && loginpw.equals(pw)) {
					System.out.println(name + "님 로그인 성공!");
					run1 = true;
				} else {
					System.out.println("로그인 실패");
				}
			} else if (menu.equals("3")) {
				System.out.println("시스템을 종료합니다");
				run = false;

			}else {
				System.out.println("없는 메뉴입니다");
			}

		}
	}

}
