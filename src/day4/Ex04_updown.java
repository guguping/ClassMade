package day4;

import java.util.Scanner;


public class Ex04_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math라는 함수는 0.1부터 1전까지의 랜덤한 숫자를 주는 함수
		//int를 넣어서 정수로 바꾸고 math와 *31을 연결
		
		// 문제 )숫자를 계속 입력 받으면서 정답을 맞추는 게임
		// 정답이 입력받은 숫자보다 크면 up 출력
		// 정답이 입력받은 숫자보다 작으면 down 출력
		// 정답을 맞추면 정답 출력후 반복문 out 빠져나오기

		Scanner sc = new Scanner(System.in);

		double answer = (int) (Math.random() * 31) + 1;
//		System.out.println(answer);

		double q = answer;
//		System.out.println(q);

		boolean con = true;
		int j = 0;
		int v = 10;

		while (con) {
			System.out.print("정답은 무엇일까요? >");
			int i = sc.nextInt();
			j++;
			v--;
			
			if (i == q) {
				System.out.println("정답입니다!\n");
				System.out.println(j + "번 만에 정답을 맞췄습니다");
				if (j <= 1) {
					System.out.println("perfect");
					break;
				} else if (j <= 3) {
					System.out.println("great");
					break;
				} else if (j <= 5) {
					System.out.println("good");
					break;
				} else if (j <= 10) {
					System.out.println("normal");
					break;
				}

			} else if (i != q && i > q) {
				System.out.println("\n정답이 아닙니다! down");
				System.out.println(j+"번 틀렸습니다");
				if(j >= 10) {
					System.out.println("game over");
					break;
				}
				System.out.println("기회가"+v+"번 남았습니다\n");
				continue;

			} else if(i !=q && i < q){
				System.out.println("\n정답이 아닙니다! up");
				System.out.println(j+"번 틀렸습니다");
				if(j >= 10) {
					System.out.println("game over");
					break;
				}
				System.out.println("기회가"+v+"번 남았습니다\n");
				continue;
			}
			

		}

	}

}
