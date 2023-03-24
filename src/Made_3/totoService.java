package Made_3;

import java.util.Random;
import java.util.Scanner;

public class totoService {
	Random rand = new Random();
	private static totoService sr = new totoService();
	totoDTO dosin = new totoDTO();
	totoRepository print = new totoRepository();
	Scanner sc = new Scanner(System.in);

	private totoService() {
	}

	public static totoService getInstance() {
		return sr;
	}
	// game1은 값이 1 있음

	public void game1_1() { // 1번메뉴 1게임
		dosin.setGame(rand.nextInt(100));
		if (dosin.getGame() % 2 == 0) {
			System.out.println("짝입니다");
		} else {
			System.out.println("홀입니다");
		}
	}
	public void game2_1re() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■일보 (도박 근절 캠패인) 사다리■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println() ;
		System.out.println("좌\t\t\t\t우");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t정답은 나도 모르지!\t│");
		System.out.println("│      끝까지 가면 내가다이겨      │");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("│\t\t\t\t│");
		System.out.println("홀\t\t\t\t짝");
	}
	public void game2_1(Integer batt) { // 2번메뉴 1게임
		// batt 1 = 왼 뱃 , 2 = 오 뱃 , 3 = 삼 , 4 = 사 , 5 = 홀 , 6 = 짝
		// batt 7 = 좌삼 짝 , 8 = 좌사 홀 , 9 = 우삼 홀 , 10 = 우사 짝
		dosin.setGame1(rand.nextInt(2)); // 사다리 0왼쪽 1오른쪽
		dosin.setGame2(rand.nextInt(2)); // 줄갯수 0 = 3줄 1 = 4줄
		if (dosin.getGame1() == 0 && batt != 1) {
			if (dosin.getGame2() == 0) { // 3줄
				print.좌삼짝();
				if (batt == 3) {
					System.out.println("3줄 배팅 성공 공간");
				}
				if (batt == 6) {
					System.out.println("짝 배팅 성공 공간");
				}
				if (batt == 7) {
					System.out.println("좌삼 짝");
				}
			} else if (dosin.getGame2() == 1 && batt == 8) { // 좌사 홀
				print.좌사홀();
				System.out.println("좌사 홀");
			}
		} else if (dosin.getGame1() == 0 && batt == 1) {
			System.out.println("왼쪽 배팅 성공 공간");
		}
		if (dosin.getGame1() == 1 && batt != 2) {
			if (dosin.getGame2() == 0) {
				print.우삼홀();
				if (batt == 9) {
					System.out.println("우삼 홀");
				}
			} else if (dosin.getGame2() == 1) {// 우사 짝
				print.우사짝();
				if (batt == 4) {
					System.out.println("4줄 배팅 성공 공간");
				}
				if (batt == 5) {
					System.out.println("홀 배팅 성공 공간");
				}
				
				if (batt == 10) {
					System.out.println("우사 짝");
				}
			}
		} else if (dosin.getGame1() == 1 && batt == 2) {
			System.out.println("오른쪽 배팅 성공 공간");
		}
	}

	public Integer batt() {
		Integer key;
		while (true) {
			System.out.println("==== 배팅 ====");
			System.out.println("1.왼쪽시작(1.95)\t2.오른쪽시작(1.95)");
			System.out.println("3.3줄(1.95)\t4.4줄(1.95)");
			System.out.println("5.홀?(1.95)\t6.짝?(1.95)");
			System.out.println("7.좌삼짝(3.25)\t8.좌사짝(3.25)");
			System.out.println("9.우삼홀(3.25)\t10.우사홀(3.25)");
			System.out.print("메뉴 >");
			key = sc.nextInt();
			if (key <= 10) {
				break;
			}else {
				System.out.println("없는 메뉴");
			}
		}
		return key;
	}
	
	
	
	
}
