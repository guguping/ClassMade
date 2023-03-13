package day3;

import java.util.Scanner;

public class Ex01_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "test";
		
		boolean run = true;
		while(run) {
			System.out.println("=====로그인=====");
			System.out.print("id:입력");
			String loginId = sc.next();
			System.out.print("pw:입력");
			String loginPw = sc.next();
			
			if(loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공");
				run = false;
			}else {
				System.out.println("로그인 실패");
				System.out.println("다시시도(Y/N)");
				String Y = sc.next();
				
				if(!(Y.equals("Y") || Y.equals("N")) && Y.equals("Y") || Y.equals("N")) {
					System.out.println("로그인 종료");
					break;
				}
						
			}
		}
		
	}

}
