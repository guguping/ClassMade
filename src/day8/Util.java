package day8;

import java.util.Scanner;

public class Util {
	// 숫자체크 메소드

	int number;

	public int numberCheck() {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력 >");
				sc.nextLine();
			}
		}
		return result;
	}

	public int numberCheak1(String str) {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println(str + "숫자만 입력 >");
				sc.nextLine();
			}
		}
		return result;
	}

	// 아이디는 16자 이내 체크 함수

	public String lengthCheak(String id1) {
		String length;
		Scanner sc = new Scanner(System.in);
		while (true) {
			length = sc.next();
			if (length.length() <= 6) {

				break;
			} else if (length.length() > 6) {
				System.out.print("6글자까지 가능합니다 >");
				sc.nextLine();
			}
		}
		return length;
	}

//	public String lengthCheck(String str,int maxLength) {
//		Scanner sc = new Scanner(System.in);
//		String result;
//		while(true) {
//			result = sc.next();
//			if(result.length() <= maxLength) {
//				break;
//			}
//			System.out.printf("%s의 최대 글자수는 %d입니다",str,maxLength);
//		}
//		return result;
//	}

}
