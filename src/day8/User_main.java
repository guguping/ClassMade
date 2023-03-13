package day8;

import java.util.Scanner;

public class User_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User[] list = new User[100];
		int cnt = 0;

		while (true) {
			System.out.println("====회원가입====");
			System.out.println("1.회원가입 2.로그인 3.리스트 4.검색 0.종로");
			System.out.print("메뉴 선택 >");
			Util util = new Util();
			int menu = util.numberCheak1("메뉴 ");

			if (menu == 1) {
				System.out.print("이름 > ");
				String name = sc.next();
				System.out.print("아이디 >");
				String id1 = util.lengthCheak("");
				System.out.print("비밀번호 >");
				String pw = sc.next();
				User user = new User(name, id1, pw);
				list[cnt] = user;
				System.out.println("회원가입 완료!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("로그인 id >");
				String id = sc.next();
				System.out.print("로그인 pw >");
				String pw = sc.next();

				for (int i = 0; i < cnt; i++) {
					if (id.equals(list[i].getId()) && pw.equals(list[i].getPw())) {
						System.out.println(list[i].getName() + "님 로그인 성공!");
						break;
					} else if (i == cnt - 1) {
						System.out.println("로그인 실패!");
					}
				}

			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("======================");
				for (int i = 0; i < cnt; i++) {
					list[i].print();
				}
				
			} else if (menu == 4) {
				System.out.print("검색 아이디 >");
				String id = sc.next();
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("======================");
				for(int i = 0 ; i < cnt ; i ++) {
					if(id.equals(list[i].getId())) {
						list[i].print();
					}
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("없는 메뉴입니다");
			}
		}
		System.out.println("시스템을 종료합니다");
	}

}
