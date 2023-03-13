package day8;

import java.util.List;
import java.util.Scanner;

public class Util2 {
	Scanner sc = new Scanner(System.in);
	User2 user2 = new User2();

	// 메뉴에 한글을 못쓰게하는 메소드
	public int menuCheck() {

		int menuNumber;
		while (true) {
			if (sc.hasNextInt()) {
				menuNumber = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력 가능합니다");
				sc.nextLine();
			}
		}
		return menuNumber;
	}

	// 길이 체크 메소드
	public String idCheck(int max) {
		String idNumber;
		while (true) {
			idNumber = sc.next();
			if (idNumber.length() > max) {
				System.out.println("아이디는" + max + "글자 이상 사용 불가!");
			} else {
				break;
			}
		}
		return idNumber;
	}

	//
	public String duCheck(List<User2> list) {
		String result;
		while (true) {
			result = sc.next();
			boolean find = false;
			for (User2 u : list) {
				if (u.getId().equals(result)) {
					System.out.println("중복된 아이디입니다\n다시입력 >");
					find = true;
					break;
				}
			}
			if (!find) {
				break;
			}
		}
		return result;
	}
}
