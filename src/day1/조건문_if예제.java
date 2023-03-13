package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		int a = -5;
//		if(a<0) {
//			System.out.println("음수입니다");
//		}else if(a>0) {
//			System.out.println("양수입니다");
//		}else if(a==0) {
//			System.out.println("0과 같습니다");
//		}
		
//		int score = 75;
//		if(score >= 90) {
//			System.out.println("A");
//		}else if(score >= 80) {
//			System.out.println("B");
//		}else if(score >= 70) {
//			System.out.println("C");
//		}else if(score >=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
//		int num = 9;
//		if(num==0) {
//			System.out.println("0입니다");
//		}else if(num%2==0){
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====계산기====");
//		System.out.print("첫번째 숫자입력>");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력>");
//		int num2 = sc.nextInt();
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴션택>");
//		int menu = sc.nextInt();
//		if(menu == 1) {
//			System.out.println(num1+"+"+num2+"="+(num1+num2));
//		}else if(menu == 2) {
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//		}else if(menu == 3) {
//			System.out.println(num1+"*"+num2+"="+(num1*num2));
//		}else if(menu == 4) {
//			System.out.println(num1+"/"+num2+"="+(num1/num2));
//		}else if(menu == 5){
//			System.out.println(num1+"%"+num2+"="+(num1%num2));
//		}else {
//			System.out.println("1~5중에 입력해주세요");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		System.out.println("====로그인====");
//		System.out.print("아이디를 입력해주세요>");
//		String id1 = sc.next();
//		System.out.print("비밀번호를 입력해주세요>");
//		String pw1 = sc.next();
//		if(id1.equals(id)) {
//			if(pw1.equals(pw)) {
//				System.out.println("로그인에 성공하셨습니다");
//			}else {
//				System.out.println("비밀번호를 확인해주세요");
//			}
//			
//		}else {
//			if(pw1.equals(pw)) {
//				System.out.println("아이디를 확인해주세요");
//			}else {
//				System.out.println("비밀번호와 아이디를 확인해주세요");
//			}
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자입력>");
			int num1 = sc.nextInt();
			
			if(num1%3==0) {
				if(num1%5==0) {
					System.out.println("3의 배수이면서 5의 배수입니다");
				}else {
					System.out.println("3의 배수입니다");
				}
		}else {
			if(num1%5==0) {
				System.out.println("5의 배수입니다");
			}else {
				System.out.println("3과 5의 배수가 아닙니다");
			}
		}
	}


 }
