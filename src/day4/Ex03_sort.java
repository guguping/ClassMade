package day4;

import java.util.Scanner;

public class Ex03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("====정렬====");
//			System.out.println("숫자입력>");
//			int num = sc.nextInt();
//
//			System.out.println("1.오름차순 2.내림차순");
//			System.out.println("메뉴선택>");
//			int menu = sc.nextInt();
//
//			if (menu == 1) {
//				for (int i = 1; i <= num; i++) {
//					System.out.println(i);
//				}
//			}
//			============내림차순 3가지 예시============
//			else if (menu == 2) {
//				for (int j = 0; num > j; num--) {
//					System.out.println(num);
//				}
//				for(int j=num; j > 0; j--) {
//					System.out.println("j");
//				}

//				for(int j = 1 ; num > 0 ; num = num-j) {
//					System.out.println(num);
//				}	
//			============내림차순 3가지 예시============

//			} else {
//				System.out.println("메뉴는 1~2까지 선택 가능합니다");
//			}
//
//		}

		Scanner sc = new Scanner(System.in);
		boolean con = true;
		while (con) {
			System.out.println("====정렬====");
			System.out.print("첫번째 숫자 입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력> ");
			int num2 = sc.nextInt();

			if (num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.println("1.오름차순 2.내림차순");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						System.out.println(i);
					}
				}
			} else if (menu == 2) {
				for (int i = num2; i >= num1; i--) {
					System.out.println(i);

				}
			}
		}
	}
}