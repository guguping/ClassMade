package day3;

import java.awt.Frame;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제) for문으로 1~100까지 짝수의 합
		// for(int i = i <=100 ; i=i+2); 를 사용하지 않고

//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);

		
//		>같은 변수 사용 가능한경우
//		int num = 0;
//		for(int i=0; i<10; i++) {
//			int sum = 0;
//			num = 10;
//			int test = 1;
//			System.out.println(test);
//			
//		}
//		int test = 8;
//		System.out.println(test);
//		System.out.println(num);
		
////		>같은 변수 사용 불가능한 경우
//		int num = 0;
//		for(int i=0; i<10; i++) {
//			int sum = 0;
//			num = 10;
//			int test = 1;
//			if(true) {
//				int test = 7;
//			}
//			System.out.println(test);
//			
//		}
//		int test = 8;
//		System.out.println(test);
//		System.out.println(num);
		
//		>홀수 합 구하기
//		int a = 1;
//		int sum = 0;
//		while(a <= 100) {
//			if(a%2 != 0) {
//			sum += a;
//			}
//			a++;
//		}
//		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>");
//		int num = sc.nextInt();
//		System.out.println(num);
		
//		> 문제) 숫자를 계속 입력받다가 0이 입력되면 '끝'출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>");
//		int num = sc.nextInt();
//		while(true) {
//			if(num == 0 ) {
//				break;
//			}
//			System.out.print("숫자입력>");
//			num = sc.nextInt();
//		}
//		System.out.println("0입니다");
		
//		Scanner sc = new Scanner(System.in);
//		int num = 1;
//		while(num != 0) {
//			System.out.print("숫자 입력>");
//			num = sc.nextInt();
//		}System.out.println("0입니다");
		
		Scanner sc = new Scanner(System.in);
		
		long money = 10000;
		boolean num = true;
		while (num) {
			System.out.println("====자판기====\t 현재잔액 : "+money+"원");
			System.out.println("1.콜라(1000원) 2.사이다(1200원) 3.우유(1500원) 0.종료");
			System.out.print("메뉴선택>");
			int sum = sc.nextInt();
			if(sum == 1 && money >= 1000) {
				money = money - 1000;
				System.out.println("콜라 구입성공!");
			}else if(sum == 2) {
				money -= 1200;
				System.out.println("사이다 구입성공!");
			}else if(sum == 3) {
				money -= 1500;
				System.out.println("우유 입니다");
			}else if(sum == 0) {
				num = false;
				System.out.println("종료");
			}else if(money > 0) {
				System.out.println("잔액이 부족합니다");
				break;
			}
			else {
				System.out.println("없는 메뉴입니다");
				break;
			}
		}
		
	}

}
