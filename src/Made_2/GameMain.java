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
				System.out.println("\t 1.살펴보기\t  2.상태창\n\t 3.상점\t\t  0.타이틀");
				System.out.println("└────────────────────────────────────────┘");
			} else if (Startmenu == 2) {
				System.out.println("gm메뉴 아직 없음");
			} else if (sr.Room() == 3 && fa == 0) {
				fa = sr.boss();// 0 or 4
				if (fa == 4) {
					System.out
							.println("\n┌─────────────── 던전" + "(" + sr.boRoom() + "/1" + ") " + "───────────────┐\n");
					System.out.println("\t\t1.도전한다");
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
			} else if (fa == 5) {
				System.out.println(sr.shop());
			} else if (fa == 6) {
				System.out.println(sr.sword());
			} else if (fa == 7) {
				System.out.println(sr.shield());
			} else if (fa == 8) {
				System.out.println(sr.luk());
			} else if (fa == 9) {
				System.out.println(sr.portion());
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
						Integer newfa = sr.bsatt0();
						if (newfa != 0) {
							fa = newfa;
						} else if (newfa == 0) {
							Startmenu = null;
							fa = 0;
							sr.resetboRoom();
							sr.resetRoom();
						}
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
					} else if (sr.Room() == 3) {
						Integer newfa = sr.bsatt1();
						if (newfa != 0) {
							fa = newfa;
						} else if (newfa == 0) {
							Startmenu = null;
							fa = 0;
							sr.resetboRoom();
							sr.resetRoom();
						}
					}
					if (fa != 0 && sr.Room() != 3) { // 일반몹 스킬 데미지
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {// 보스몹 스킬 데미지
						sr.famenu1();
					}
				} else if (fa == 4) {
					fa = sr.bomove();
				} else if (fa == 5) {
					fa = 6;
				} else if (fa == 6) {
					if (menu <= 5) {
						sr.swordbuy(menu);
						fa = 6;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 7) { ////////////////// 실드상점
					if (menu <= 4) {
						sr.shieldbuy(menu);
						fa = 7;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 8) {
					if (menu <= 4) {
						sr.Lntup(menu);
						fa = 8;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 9) {
					if (menu <= 5) {
						sr.portionbuy(menu);
						fa = 9;
					} else {
						System.out.println("   없는건 못팔아요");
					}
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
					} else if (sr.Room() == 3) {
						Integer newfa = sr.bsatt2();
						if (newfa != 0) {
							fa = newfa;
						} else if (newfa == 0) {
							Startmenu = null;
							fa = 0;
							sr.resetboRoom();
							sr.resetRoom();
						}
					}
					if (fa != 0 && sr.Room() != 3) { // 일반몹 스킬 데미지
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {// 보스몹 스킬 데미지
						sr.famenu1();
					}
				} else if (fa == 5) {
					fa = 7;
				} else if (fa == 6) {
					if (menu <= 5) {
						sr.swordbuy(menu);
						fa = 6;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 7) { ////////////////// 실드상점
					if (menu <= 4) {
						sr.shieldbuy(menu);
						fa = 7;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 8) {
					if (menu <= 4) {
						sr.Lntup(menu);
						fa = 8;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 9) {
					if (menu <= 5) {
						sr.portionbuy(menu);
						fa = 9;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				}
			} else if (menu == 3) {
				if (Startmenu == null && fa == 0) {
//				
				} else if (Startmenu == 1 && fa == 0) {
					fa = 5;
				} else if (fa == 1) {
					fa = 0;
				} else if (fa == 3) {
					if (sr.Room() != 3) {
						fa = sr.fatt3();
					} else if (sr.Room() == 3) {
						Integer newfa = sr.bsatt1();
						if (newfa != 0) {
							fa = newfa;
						} else if (newfa == 0) {
							Startmenu = null;
							fa = 0;
							sr.resetboRoom();
							sr.resetRoom();
						}
					}
					if (fa != 0 && sr.Room() != 3) {
						sr.famenu();
					}
					if (fa != 0 && sr.Room() == 3) {
						sr.famenu1();
					}
				} else if (fa == 5) {
					fa = 8;
				} else if (fa == 6) {
					if (menu <= 5) {
						sr.swordbuy(menu);
						fa = 6;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 7) { ////////////////// 실드상점
					if (menu <= 4) {
						sr.shieldbuy(menu);
						fa = 7;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 8) {
					if (menu <= 4) {
						sr.Lntup(menu);
						fa = 8;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 9) {
					if (menu <= 5) {
						sr.portionbuy(menu);
						fa = 9;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				}
			} else if (menu == 4) {
				if (Startmenu == null && fa == 0) {
//					sr.아직없음
				} else if (fa == 2) {
					fa = 0;
				} else if (fa == 3) {
					fa = 2;
				} else if (fa == 5) {
					fa = 9;
				} else if (fa == 6) {
					if (menu <= 5) {
						sr.swordbuy(menu);
						fa = 6;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 7) { ////////////////// 실드상점
					if (menu <= 4) {
						sr.shieldbuy(menu);
						fa = 7;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 8) {
					if (menu <= 4) {
						sr.Lntup(menu);
						fa = 8;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				} else if (fa == 9) {
					if (menu <= 5) {
						sr.portionbuy(menu);
						fa = 9;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				}
			} else if (menu == 5) {
				if (fa == 6) {
					if (menu <= 5) {
						sr.swordbuy(menu);
						fa = 6;
					} else {
						System.out.println("   없는건 못팔아요");
					}
				}
			} else if (menu == 0) {
				if (Startmenu == null && fa == 0) {
					break;
				} else if (Startmenu == 1 && fa == 0) {
					Startmenu = null;
				} else if (Startmenu == 1 && fa == 5) {
					fa = 0;
				} else if (Startmenu == 1 && fa == 6) {
					fa = 5;
				} else if (Startmenu == 1 && fa == 7) {
					fa = 5;
				} else if (Startmenu == 1 && fa == 8) {
					fa = 5;
				} else if (Startmenu == 1 && fa == 9) {
					fa = 5;
				}
			} else if (menu == 960220) {
				Startmenu = 2;
				System.out.println("어케알았누 ?");
			}
		}
		System.out.println("   시스템을 종료합니다");
	}
}
