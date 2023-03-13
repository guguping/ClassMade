package day2;

import java.util.Scanner;

public class 조건문_switch_case예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제) 변수 a에 숫자를 입력받고, 1~12월 까지 각각 매 달의 영어를 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		
//		int a = sc.nextInt();
//		switch(a) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//			default:
//			System.out.println("1~12 까지만 입력해주세요.");
//		}
		
		//문제) 숫자 두개를 입력받고,
		// 메뉴에서 하나를 선택하여 결과 출력 (1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====계산기====");
		System.out.print("첫번째 숫자> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자> ");
		int num2 = sc.nextInt();
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지 ");
		System.out.print("선택> ");
		int chk = sc.nextInt();
		
		switch(chk) {
		case 1 :
//			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
			break;
		case 2 :
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case 3 :
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case 4 :
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;
		case 5 :
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
			default:
				System.out.println("1~5까지만 선택해주세요.");
		}
	}

}