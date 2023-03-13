package day7;

import java.util.Scanner;

public class Ex01_User_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex01_User[] userList = new Ex01_User[100];
		int cnt = 0;

		while (true) {
			System.out.println("====회원가입====");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴 선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				Ex01_User user = new Ex01_User();
				System.out.print("이름 입력 >"); 
				user.setName(sc.next()); // 객체로 입력받음
				System.out.print("아이디 입력 >");
				user.setId(sc.next());  // 객체로 입력받음
				System.out.print("비밀번호 입력 >");
				user.setPw(sc.next());  // 객체로 입력받음
				userList[cnt] = user;
				System.out.println("회원가입 성공!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("로그인 아이디 >");
				String loginId = sc.next();
				System.out.print("로그인 비밀번호 >");
				String loginPw = sc.next();
				
				for(int i = 0 ; i <cnt ; i++) {
					if(loginId.equals(userList[i].getId())&&loginPw.equals(userList[i].getPw())) {
						System.out.println(userList[i].getName()+"님 로그인 성공!");
						break;
					}else if(i == cnt-1) {
						System.out.println("로그인 실패");
					}
				}
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("------------------------");
				for(int i = 0 ; i <cnt ; i++) {
					userList[i].print();
				}
			} else if (menu == 0) {
				break;
			}else {
				System.out.println("없는 메뉴");
			}
		}
		System.out.println("시스템 종료");
	}

}
