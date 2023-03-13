package made_1;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserService userservice = new UserService();
		boolean loginOk = false;

		while (true) {
			System.out.println("====" + UserDTO.getDomain() + "====");
			if (loginOk) {
				System.out.println("1.마이페이지 2.로그아웃 3.회원정보수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원리스트 4.도메인변경 0.종료");
			}
			System.out.print("메뉴 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (loginOk == true) {

				} else {
					userservice.save();
				}
			} else if (menu == 2) {
				if (loginOk == true) {
					loginOk = false;
				} else {
					loginOk = userservice.FindbyLogin();
				}
			} else if (menu == 3) {
				if (loginOk == true) {
					userservice.ReUser();
				} else {
					userservice.findAll();
				}
			} else if (menu == 4) {
				if (loginOk == true) {
					userservice.Remove();
					loginOk = false;
				} else {
					System.out.print("변경할 도메인 >");
					UserDTO.setDomain(sc.next());
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("없는 메뉴");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
