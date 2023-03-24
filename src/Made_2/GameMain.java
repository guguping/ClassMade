package Made_2;

import java.util.Scanner;

public class gameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gameService sr = gameService.getInstance();
		Integer Startmenu = null;
		int fa = 0;

		while (true) {
			if (Startmenu == null || Startmenu == 2) {
				System.out.println("┌──────────────────넥슨──────────────────┐");
				System.out.println("\t1.새로하기 2.이어하기 0.종료");
				System.out.println("└───────────────────────────────────────┘");
			} else if (Startmenu == 1 && fa == 0 && sr.Room() != 3) {
				System.out.println("\n┌─────────────── 던전" + "(" + sr.Room() + "/3" + ") " + "───────────────┐");
				System.out.println("     1.살펴보기 2.상태창 3.상점 0.타이틀");
				System.out.println("└────────────────────────────────────────┘");
			} else if (Startmenu == 2) {
				System.out.println("gm메뉴 아직 없음");
			} else if (sr.Room() == 3 && fa == 0) {
				fa = sr.boss();// 0 or 4
				if (fa == 4) {
					System.out
							.println("\n┌─────────────── 던전" + "(" + sr.boRoom() + "/1" + ") " + "───────────────┐\n");
					System.out.println("\t    1.도전한다 2.살펴보기 ");
					System.out.println("\n└────────────────────────────────────────┘");
				} else if (fa == 0) {
					System.out.println("   겁쟁이는 필요없어");
					continue;
				}
			}
			if (fa == 1) {
				System.out.println("\n┌─────────────── 던전" + "(" + sr.Room() + "/3" + ") " + "───────────────┐");
				System.out.println("\t  1.전진한다 2.몰래이동 3.정비한다");
				System.out.println("└────────────────────────────────────────┘");
			} else if (fa == 2) {
				System.out.println("\n┌──────────────" + "HP" + sr.fahp() + "/MP" + sr.famp() + "──────────────┐");
				System.out.println("\t1.공격" + "(" + sr.faat() + ")" + "\t   2.스킬\n\t3.없어용\t\t   4.도망간다");
				System.out.println("└───────────────────────────────────────┘");
			} else if (fa == 3) {
				System.out.println("\n┌──────────────────스킬──────────────────┐");
				System.out.println("\t" + "1." + sr.att1() + "\t " + "2." + sr.att2() + "   \n\t" + "3." + sr.att3()
						+ "\t " + "4.뒤로가기");
				System.out.println("└───────────────────────────────────────┘");
			}
			System.out.print("   메뉴 >");
			Integer menu = sc.nextInt();

			if (menu == 1) {
				if (Startmenu == null && fa == 0) {
					Startmenu = sr.newgame();
				} else if (Startmenu == 1 && fa == 0 && sr.Room() != 3) {
					fa = sr.See();
				} else if (fa == 1) {
					if (sr.Room() != 3) {
						fa = sr.move();
					} else if (sr.Room() == 3) {
						fa = sr.bomove();
					}
				} else if (fa == 2) {
					if (sr.Room() != 3) {
						fa = sr.faatt0();
					} else if (sr.Room() == 3) {
						fa = sr.bsatt0();
					}
					if (fa != 0 && sr.Room() != 3) {
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {
							sr.famenu1();
					}
				} else if (fa == 3) {
					if (sr.Room() != 3) {// 일반몹 스킬
						fa = sr.fatt1();
					} else {// 보스몹 스킬
						fa = sr.bsatt1();
					}
					if (fa != 0 && sr.Room() != 3) { // 일반몹 스킬 데미지
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {// 보스몹 스킬 데미지
						sr.famenu1();
					}
				} else if (fa == 4) {
					fa = sr.bomove();
				}
			} else if (menu == 2) {
				if (Startmenu == null && fa == 0) {
					if (sr.key == 0) {
						System.out.println("   세이브 없음");
					} else {
						Startmenu = 1;
					}
				} else if (Startmenu == 1 && fa == 0) {
					sr.charSee();
				} else if (fa == 1) {
					if (sr.hideMove()) {
						fa = 0;
					} else {
						sr.famenu();
						fa = 2;
					}
				} else if (fa == 2) {
					if (fa != 0 && sr.Room() != 3) {
						sr.famenu();
						fa = 3;
					}
					if (fa != 0 && sr.Room() == 3) {
						sr.famenu1();
						fa = 3;
					}
				} else if (fa == 3) {
					if (sr.Room() != 3) {// 일반몹 스킬
						fa = sr.fatt2();
					} else {// 보스몹 스킬
						fa = sr.bsatt2();
					}
					if (fa != 0 && sr.Room() != 3) { // 일반몹 스킬 데미지
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {// 보스몹 스킬 데미지
						sr.famenu1();
					}
				}
			} else if (menu == 3) {
				if (Startmenu == null && fa == 0) {
//				
				} else if (Startmenu == 1 && fa == 0) {
//				
				} else if (fa == 1) {
					fa = 0;
				} else if (fa == 3) {
					if (sr.Room() != 3) {
						fa = sr.fatt3();
					} else if (sr.Room() == 3) {
						fa = sr.bsatt3();
					}
					if (fa != 0 && sr.Room() != 3) {
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {
						sr.famenu1();
					}
				}
			} else if (menu == 4) {
				if (Startmenu == null && fa == 0) {
//					sr.아직없음
				} else if (Startmenu == 1 && fa == 0) {
//				sr.shop();
				} else if (fa == 2) {
					fa = 0;
				} else if (fa == 3) {
					fa = 2;
				}
			} else if (menu == 0) {
				if (Startmenu == null && fa == 0) {
					break;
				} else if (Startmenu == 1 && fa == 0) {
					Startmenu = null;
				}
			} else if (menu == 960220) {
				Startmenu = 2;
				System.out.println("어케알았누 ?");
			}
		}
		System.out.println("   시스템을 종료합니다");
	}
}
