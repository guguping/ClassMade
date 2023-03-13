package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] id = new String[100];
		String[] pw = new String[100];
		String[] date = new String[100];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		
		int cnt = 0;
		

		while (true) {
			System.out.println("====회원가입====");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴 선택 >");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("이름 입력 >");
				name[cnt] = sc.next();
				System.out.print("아이디 입력 >");
				id[cnt] = sc.next();
				System.out.print("비밀번호 입력 >");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now(); 
				date[cnt] = dtf.format(now);
				System.out.println("회원가입 성공!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("아이디 입력 >");
				String id1 = sc.next();
				System.out.print("비밀번호 입력 >");
				String pw1 = sc.next();

				boolean op = false;
				for (int i = 0; i < cnt; i++) {
					if (id1.equals(id[i]) && pw1.equals(pw[i])) {
						System.out.println(name[i] + "님 로그인 성공!");
						break;
					}else if( i ==cnt-1) {
						System.out.println("로그인 실패");
					}
				}
				
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("-------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i],date[i]);
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}

	}

}
