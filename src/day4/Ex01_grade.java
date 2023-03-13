package day4;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====성적=====");
			System.out.print("이름>");
			String name = sc.next();
			System.out.print("국어점수 입력>");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력>");
			int eng = sc.nextInt();
			System.out.print("수학점수 입력>");
			int mat = sc.nextInt();
			int total = kor + eng + mat;
			double avg = total / 3.;
			char grade = ' ';

			if (avg > 90) {
				grade = 'a';
			} else if (avg > 80) {
				grade = 'b';
			} else if (avg > 70) {
				grade = 'c';
			} else if (avg > 60) {
				grade = 'd';
			} else {
				grade = 'f';
			}
			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name,kor,eng,mat,total,avg,grade);
			// %d = 숫자 , %s = 문자열 , %f = 실수 , %c = 문자
			System.out.print("다시입력(Y/y)>");
			String reStart = sc.next();
			
//			if(reStart.equals("Y") || reStart.equals("y")) {
//				continue; 이런경우 컨티뉴가 없어도 반복한다 그러니까 이 if문은 있으나 없으나 똑같다
//			}
				if(!(reStart.equals("Y") || reStart.equals("y"))){
				System.out.println("종료합니다");
				break;
			}
			
//			
		}
	}

}
