package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		int i = 1;
////		while(a <= 10) {
////			System.out.println("안녕하세요");
////			a++;
////		}
//		while(i <= 10000) {
//			i++;
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		//문제) 숫자를 계속 입력받다가 0이 입력되면 반복문 종료
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		while(a > 0) {
//			System.out.print("숫자입력> ");
//			a = sc.nextInt();
//			while(a == 0) {
//				break;
//			}
//		}System.out.println("끝");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		while(a > 0) {
//			System.out.print("숫자입력> ");
//			a = sc.nextInt();
//		}
//		System.out.println("끝");
		
//		Scanner sc = new Scanner(System.in);
//		boolean check = true;
//		while(check) {
//			System.out.println("숫자입력> ");
//			int num = sc.nextInt();
//			if(num == 0) {
//				check = false;
//			}
//		}
//		Scanner sc = new Scanner(System.in);
//		int a = -1;
//		while(a != 0) {
//			System.out.print("숫자입력> ");
//			a = sc.nextInt();
//		}
//		System.out.println("끝");
//		
		//문제) 숫자를 계속 입력받으면서 3의배수, 5의배수, 3과 5의배수를 출력하는데,
		//	   0이 입력되면 반복문을 종료 하고 끝 출력
		
//		Scanner sc = new Scanner(System.in);
//		boolean check = true;
//		while(check) {
//			System.out.print("숫자입력> ");
//			int num = sc.nextInt();
//			if(num == 0) {
//				check = false;
//			}else if(num % 3 == 0 && num % 5 == 0) {
//				System.out.println("3과 5의배수");
//			}else if(num % 3 == 0) {
//				System.out.println("3의배수");
//			}else if(num % 5 == 0) {
//				System.out.println("5의배수");
//			}else {
//				System.out.println("3과 5의배수가 아닙니다");
//			}
//		}
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while(num != 0) {
			System.out.print("숫자입력> ");
			num = sc.nextInt();
			if(num != 0) {
				if(num % 3 == 0 && num % 5 == 0){
					System.out.println("3과 5의배수");
				}else if(num % 3 == 0) {
					System.out.println("3의배수");
				}else if(num % 5 == 0) {
					System.out.println("5의배수");
				}else {
					System.out.println("3과 5의배수가 아닙니다");
				}
			}
		}
		System.out.println("끝");
	}
}

