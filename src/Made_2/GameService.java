package Made_2;

import java.util.Scanner;

public class gameService {
	gameRepository br = gameRepository.getInstance();
	private static gameService sr = new gameService();

	private gameService() {
	}

	public static gameService getInstance() {
		return sr;
	}

	int key = 0;
	int mkey = 0;
	int strkey = 0;

	public Integer newgame() {
		Scanner sc = new Scanner(System.in);
		if (key != 0) {
			System.out.println("   이전에 있던 내용은 사라집니다");
			System.out.print("   새로 시작하시겠습니까? (Y/N)");
			String newS = sc.next();
			if (newS.equals("y") || newS.equals("Y")) {
				br.reStart(key);
				key = 0;
				mkey = 0;
			} else if (newS.equals("n") || newS.equals("N")) {
				return null;
			} else {
				System.out.println("장난치지 말그라");
			}
		}
		if (key == 0) {
			System.out.println("\t1.이지 2.노멀 3.하드");
			System.out.print("   모드 선택 >");
			key = sc.nextInt();
			gameCharacterDTO gc = new gameCharacterDTO(key);
			gameMonsterDTO go = new gameMonsterDTO(key);
			gameSkillDTO sk = new gameSkillDTO(key, gc);
			br.newSkill(sk);
			br.newMonster(go);
			mkey = go.getmodMon();
			String oo = br.newGame(gc);
			if (key == 1) {
				if (oo == null) {
					System.out.println("로딩 오류");
					return null;
				} else {
					System.out.println(oo);
				}
			} else if (key == 2) {
				if (oo == null) {
					System.out.println("로딩 오류");
					return null;
				} else {
					System.out.println(oo);
				}
			} else if (key == 3) {
				if (oo == null) {
					System.out.println("로딩 오류");
					return null;
				} else if (oo != null) {
					System.out.println("   하드모드는 죽으면 캐릭터가 삭제됩니다");
					System.out.print("   진행하시겠습니까 ?(Y/N)");
					String mode = sc.next();
					if (mode.equals("y") || mode.equals("Y")) {
						System.out.println(oo);
						return 1;
					} else if (mode.equals("n") || mode.equals("N")) {
						return null;
					} else {
						System.out.println("장난치지 말그라");
					}
				}
			}
		}
		return 1;
	}

	public Integer See() {
		if (key == 1) {
			System.out.println(br.seeMap(mkey));
		} else if (key == 2) {
			System.out.println(br.seeMap(mkey));
		} else if (key == 3) {
			System.out.println(br.seeMap(mkey));
		}
		return 1;
	}

	public void charSee() {
		System.out.println(br.charSee(key));
	}

	public Integer move() {
		gameMonsterDTO mon = br.move(mkey);

		System.out.println("\n\u001B[31m    \t 앗! 야생의 " + mon.getMon1() + "이 나타났다!\n\u001B[0m");
		System.out.println(mon.toString1());
		return 2;
	}

	public void famenu() {
		gameMonsterDTO mon = br.move(mkey);
		System.out.println(mon.toString1());
	}

	public String att1() {
		return br.attMenu(key).toString1();
	}

	public String att2() {
		return br.attMenu(key).toString2();
	}

	public String att3() {
		return br.attMenu(key).toString3();
	}

	public void fatt1() {
		System.out.println("   "+br.attMenu(key).toString1()+"데미지");
		br.death1(mkey);
	}

	public void fatt2() {
		System.out.println("   "+br.attMenu(key).toString2()+"데미지");
		br.death2(mkey);
	}

	public void fatt3() {
		System.out.println("   "+br.attMenu(key).toString3()+"데미지");
		br.death3(mkey);
	}
}
