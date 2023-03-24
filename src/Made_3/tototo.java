package Made_3;

import java.util.Scanner;

public class tototo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totoService sr = totoService.getInstance();
		Scanner sc = new Scanner(System.in);
		int gameMenu = 0;
		Integer batt = null;
		while (true) {
			System.out.println("====인천일보 토토토====");
			if(gameMenu == 0) {
				System.out.println("1.상남자 2.분석가 3.충전 4.환급 0.종료");
			}else if (gameMenu == 1) {
				System.out.println("1.홀짝 (상남자의 배팅) 2.경마(상남자의 배팅) 0.뒤로가기");
			} else if (gameMenu == 2) {
				System.out.println("1.사다리(분석가의 배팅) 0.뒤로가기");
			}
			System.out.print("메뉴 >");
			String key = sc.next();

			if (key.equals("1")) { // 상남자
				if(gameMenu == 0) { // 1번 메뉴판으로
					gameMenu =1;
				}else if(gameMenu ==1) { // 상남자 1번게임
					sr.game1_1();
				}else if(gameMenu ==2) { // 분석가 1번게임
					sr.game2_1re();
					batt = sr.batt();
					sr.game2_1(batt);
				}
			}else if(key.equals("2")) { // 분석가 
				if(gameMenu == 0) { // 메뉴판 2번으로
					gameMenu = 2;
				}
			}else if(key.equals("0")) {// 종료 , 뒤로가기
				if(gameMenu == 0) { // 종료
					break;
				}else if(gameMenu ==1) { // 상남자 > 기본 메뉴판으로
					gameMenu = 0;
				}else if(gameMenu ==2) { // 분석가 > 기본 메뉴판으로 
					gameMenu = 0;
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
