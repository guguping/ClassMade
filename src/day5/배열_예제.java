package day5;

import java.util.Scanner;

public class 배열_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 문자열 배열에 문자열 5개를 할당하고, 전체 출력

		// 방법1)
//		String [] i = new String[5];
//		
//		i[0] = "2조";
//		i[1] = "이광명";
//		i[2] = "이은수";
//		i[3] = "박문선";
//		i[4] = "이호섭";
//		
//		for(int j = 0 ; j < i.length;j++) {
//			System.out.println(i[j]);
//		}

//		> 방법2)
//		String[] str = {"안녕","하세요","반가","워요","잘있어요"};
//		System.out.println(str.length); //배열 str의 길이를 알아볼때
//		
//		for(int i = 0 ; i<str.length;i++) {
//			System.out.println(str[i]);
//		}

		// > 방법3)
//		String[] str = new String[5];
//		str[0] = "안녕";
//		str[1] = "안녕";
//		str[2] = "안녕";
//		str[3] = "안녕";
//		str[4] = "안녕";									
//		
//		for(int i = 0 ; i<str.length;i++) {
//			System.out.println(str[i]);
//		}

//		// 문제) int배열 10칸에 값을 할당하고 , 총 합 출력
//		int [] sum = {2,34,53,23,5,2,6,75,4,5};
//		int j = 0;
//		System.out.println(sum.length);
//		
//		for(int i = 0 ; i < sum.length;i=i++) {
//			System.out.println(sum[i]);
//			j = j+sum[i];
//			
//		}
//		System.out.println(j);

		// 문제) 짝수번째 index의 합을 구하기
//				int [] sum = {2,34,53,23,5,2,6,75,4,5};
//				int j = 0;
//				System.out.println(sum.length);
//				
//				for(int i = 0 ; i < sum.length;i=i+2) {
//					System.out.println(sum[i]);
//					j = j+sum[i];
//					
//				}
//				System.out.println(j);

		// 문제) 값이 짝수인것 더 하기
//				int [] sum = {2,34,53,23,5,2,6,75,4,5};
//				int j = 0;
//				System.out.println(sum.length);
//				
//				for(int i = 0 ; i < sum.length;i++) {
//					if(sum[i]%2 == 0) {
//					System.out.println(sum[i]);
//					j = j+sum[i];
//					}
//				}
//				System.out.println(j);

		// 문제) 변수 배열 num에 1~100까지 수를 넣고 출력
//		int[] num = new int[100]; 
//		for(int i  = 0  ; i < num.length ;i++ ) {
//			num[i] = i+1;
//		}
//		
//		for(int i = 0 ; i < num.length ; i++) {
//			System.out.println(num[i]);
//		}

//		// 문제)num 1~10까지 입력받고 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int[] num = new int[10];
//		
//		for(int num1 = 0 ; num1 < num.length; num1++) {
//			System.out.println("숫자를 입력해주세요");
//			num[num1] = sc.nextInt();
//			
//		}
//		for(int num2 = 0 ; num2 < num.length ; num2++) {
//			System.out.println(num[num2]);
//		}

//		// 문제) 10칸짜리 정수 배열 선언 후 값을 입력 받고 , 입력받은 것중 3의 배수의 갯수 5의 배수의 갯수 3,5가 겹치는 배수의 갯수
//		
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int con1 = 0;
//		int con2 = 0;
//		int con3 = 0;
//		
//		for(int i = 0 ; i < num.length ; i++) {
//			System.out.println("숫자를 입력해 주세요");
//			num[i]=sc.nextInt();
//			
//		}
//		for(int j = 0 ; j  < num.length; j++) {
//			if(num[j] % 3 == 0 && num[j] % 5 == 0) {	
//				con1++;
//			}
//			if(num[j] % 3 == 0) {
//				con2++;;
//			}
//			if(num[j] % 5 == 0) {
//				con3++;
//			}
//			
//		}
//		System.out.println("3과5의 배수에 겹치는 갯수는" + con1 +"개 입니다" );
//		System.out.println("3의 배수 갯수는"+con2 +"개 입니다");
//		System.out.println("3의 배수 갯수는"+con3 +"개 입니다");

		// 문제) 10칸의 정수배열을 만들고,반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력 (짝수만 10개 입력 받을 때 까지 계속 반복)
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[10];
//		
//		for(int i = 0;i<num.length;i++) {
//			System.out.println("숫자 입력>");
//			int number = sc.nextInt();
//			if(number % 2 == 0) {
//				num[i] = number;
//			}else {
//				i--;
//			}
//		}
//		for(int i =0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		// 문제) 10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int j = 0;
//
//		while (j < 10) {
//			System.out.print("숫자입력> ");
//			int number = sc.nextInt();
//
//			if (number % 2 == 0) {
//				num[j] = number;
//				j++;
//				
//			}	
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

//		for(int i=0; i<num.length; i++) {
//		System.out.print("숫자입력> ");
//			int number = sc.nextInt();
//			
//			if(number % 2 == 0) {
//				num[i] = number;
//			}else {
//				i--;
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}

		// 문제) 배열 num의 값을 앞으로 한칸씩 땡기시오
		// 출력 예) {2,3,4,5,6,7,8,9,10,1}

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num1 = num[num.length-1];
		
		
		for (int i = num.length-1; i >= 0; i--) {
			if(i == 0) {
				num[i] = num1;
				break;
			}
			num[i] = num[i-1]; 
		}
		for(int i = 0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
	}

}
