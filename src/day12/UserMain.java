package day12;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Userservice service = Userservice.getInstance(); // 싱글톤으로 만든 객체를 사용하는 방법
		boolean loginOk = false;

		while (true) {
			System.out.println("====" + UserDTO.getDomain() + "====");
			if (loginOk) {
				System.out.println("1.정보읽기 2.로그아웃 3.회원수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 4.도메인변경 0.종료");
			}
			System.out.print("선택 >");
			int menu = Util.numberCheck();

			if (menu == 1) {
				if (loginOk) {
					service.findById();
				} else {
					service.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					loginOk = service.logout();
				} else {
					loginOk = service.login();
				}
			} else if (menu == 3) {
				if (loginOk) {
					loginOk =service.upDate();
				} else {
					service.list();
				}
			} else if (menu == 4) {
				if (loginOk) {
					loginOk =service.delete();
				} else {
					service.domainChange();
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("시스템 종료");
	}

}
