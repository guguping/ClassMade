package Made_2;

import java.util.Scanner;

public class gameService {
	gameRepository br = gameRepository.getInstance();
	private static gameService sr = new gameService();
	double probability = Math.random();

	private gameService() {
	}

	public static gameService getInstance() {
		return sr;
	}

	int key = 0;
	int mkey = 0;
	int strkey = 0;
	int clkey = 0;
	int blkey = 0;
	int bokey = 0;

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
		System.out.println(br.charSee(key).toString());
	}

	public Integer move() {
		gameMonsterDTO mon = br.move(mkey);
		System.out.println("\n┌──────────────────경고──────────────────┐");
		System.out.println("\n\u001B[31m    \t 앗! 던전의 " + mon.getMon1() + "이 나타났다!\n\u001B[0m");
		System.out.println("└───────────────────────────────────────┘\n");
		System.out.println(mon.toString1());
		return 2;
	}
	public Integer bomove() {
		gameMonsterDTO mon = br.bomove(mkey);
		System.out.println("\n┌──────────────────경고──────────────────┐");
		System.out.println("\n\u001B[31m    \t앗! 던전의 " + mon.getBoss() + "이 나타났다!\n\u001B[0m");
		System.out.println("└───────────────────────────────────────┘\n");
		System.out.println(mon.toString2());
		return 2;
	}
	public void famenu() {
		gameMonsterDTO mon = br.move(mkey);
		System.out.println(mon.toString1());
	}
	public void famenu1() {
		gameMonsterDTO mon = br.bomove(mkey);
		System.out.println(mon.toString2());
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

	public int faatt0() {
		System.out.println("\n┌──────────────────전투──────────────────┐");
		System.out.println("\n\t    " + br.charSee(key).getName() + "의 공격(" + br.charSee(key).getAtt() + ")" + "데미지");
		System.out.println("\t    " + br.move(mkey).getMon1() + "의 반격(" + br.monAtt(key) + ")" + "데미지\n");
		System.out.println("└───────────────────────────────────────┘\n");
		if (br.death0(mkey)) {
			System.out.println("\n┌──────────────────생존──────────────────┐\n");
			clkey = br.dcheak(key);
			System.out.println("\n└───────────────────────────────────────┘\n");
			gameMonsterDTO MTO = new gameMonsterDTO(key);
			br.newMonster(MTO);
			return 0;
		}
		return 2;
	}
	public int bsatt0() {
		System.out.println("\n┌──────────────────전투──────────────────┐");
		System.out.println("\n\t    " + br.charSee(key).getName() + "의 공격(" + br.charSee(key).getAtt() + ")" + "데미지");
		System.out.println("\t  " + br.move(mkey).getBoss() + "의 반격(" + br.monAtt(key) + ")" + "데미지\n");
		System.out.println("└───────────────────────────────────────┘\n");
		if (br.bsdeath0(mkey)) {
			System.out.println("┌──────────────────생존──────────────────┐\n");
			blkey = br.bsdcheak(mkey);
			System.out.println("\n└───────────────────────────────────────┘\n");
//			gameMonsterDTO MTO = new gameMonsterDTO(key);
//			br.newMonster(MTO);
			return 0;
		}
		return 2;
	}

	public int fatt1() {
		System.out.println("\n┌──────────────────전투──────────────────┐");
		System.out.println("\n\t    " + br.charSee(key).getName() + "의 " + br.attMenu(key).toString1() + "데미지");
		System.out.println("\t    " + br.move(mkey).getMon1() + "의 반격(" + br.monAtt(key) + ")" + "데미지\n");
		System.out.println("└───────────────────────────────────────┘\n");
		if (br.death1(mkey)) {
			System.out.println("\n┌──────────────────생존──────────────────┐\n");
			clkey = br.dcheak(key);
			System.out.println("\n└───────────────────────────────────────┘\n");
			gameMonsterDTO MTO = new gameMonsterDTO(key);
			br.newMonster(MTO);
			return 0;
		}
		return 2;
	}

	public int fatt2() {
		System.out.println("\n┌──────────────────전투──────────────────┐");
		System.out.println("\n\t    " + br.charSee(key).getName() + "의 " + br.attMenu(key).toString2() + "데미지");
		System.out.println("\t    " + br.move(mkey).getMon1() + "의 반격(" + br.monAtt(key) + ")" + "데미지\n");
		System.out.println("└───────────────────────────────────────┘\n");
		if (br.death2(mkey)) {
			System.out.println("\n┌──────────────────생존──────────────────┐\n");
			clkey = br.dcheak(key);
			System.out.println("\n└───────────────────────────────────────┘\n");
			gameMonsterDTO MTO = new gameMonsterDTO(key);
			br.newMonster(MTO);
			return 0;
		}
		return 2;
	}

	public int fatt3() {
		System.out.println("\n┌──────────────────전투──────────────────┐");
		System.out.println("\n\t    " + br.charSee(key).getName() + "의 " + br.attMenu(key).toString3() + "데미지");
		System.out.println("\t    " + br.move(mkey).getMon1() + "의 반격(" + br.monAtt(key) + ")" + "데미지\n");
		System.out.println("└───────────────────────────────────────┘\n");
		if (br.death3(mkey)) {
			System.out.println("\n┌──────────────────생존──────────────────┐\n");
			clkey = br.dcheak(key);
			System.out.println("\n└───────────────────────────────────────┘\n");
			gameMonsterDTO MTO = new gameMonsterDTO(key);
			br.newMonster(MTO);
			return 0;
		}
		return 2;
	}
	public int faat() {
		return br.charSee(key).getAtt();
	}

	public int fahp() {
		return br.charSee(key).getHp();
	}

	public int famp() {
		return br.charSee(key).getMp();
	}

	public int Room() {
		return br.Room(key).getRoom();
	}
	public int boRoom() {
		return br.boRoom(key).getBossroom();
	}

	public int boss() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\u001B[31m┌──────────────────경고──────────────────┐\u001B[0m\n");
		System.out.println("\t    이앞은 보스방입니다\n\t 진입시 정비할 수 없습니다\n\t   진입하시겠습니까?(Y/N)");
		System.out.println("\n\u001B[31m└───────────────────────────────────────┘\u001B[0m\n");
		while (true) {
		System.out.print("   메뉴 >");
		String bome = sc.next();
			if (bome.equals("y") || bome.equals("Y")) {
				return 4;
			} else if (bome.equals("n") || bome.equals("N")) {
				clkey = br.boss(clkey, mkey);
				return 0;
			} else {
				continue;
			}
		}

	}

	public boolean hideMove() {
		if (probability < br.hide(key)) {
			System.out.println("\n┌──────────────────행운──────────────────┐\n");
			clkey = br.dcheak(key);
			System.out.println("\n\t     세상에 운이 좋은걸?\n");
			System.out.println("└───────────────────────────────────────┘\n");
			gameMonsterDTO MTO = new gameMonsterDTO(key);
			br.newMonster(MTO);
			return true;
		} else {
			System.out.println("\n┌──────────────────경고──────────────────┐");
			System.out.println("\n\u001B[31m\t\t   앗! " + br.move(mkey).getMon1() + "에게 기습당했다\n\t\t  " + br.monAtt(key)
					+ "데미지\u001B[0m\n");
			System.out.println("└───────────────────────────────────────┘\n");
			return false;
		}
	}
}
