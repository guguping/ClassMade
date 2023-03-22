package Made_2;

import java.util.Scanner;

public class gameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer Startmenu = null;
		int fa = 0;
		gameService sr = gameService.getInstance();
		while (true) {
			if (Startmenu == null || Startmenu == 2) {
				System.out.println("┌──────────────────넥슨──────────────────┐");
				System.out.println("\t1.새로하기 2.이어하기 0.종료");
				System.out.println("└───────────────────────────────────────┘");
			} else if (Startmenu == 1 && fa == 0) {
				System.out.println("┌──────────────────던전──────────────────┐");
				System.out.println("     1.살펴보기 2.상태창 3.상점 0.타이틀");
				System.out.println("└───────────────────────────────────────┘");
			} else if (Startmenu == 2) {
				System.out.println("gm메뉴 아직 없음");
			}
			if (fa == 1) {
				System.out.println("┌──────────────────던전──────────────────┐");
				System.out.println("\t    1.전진한다 2.정비한다");
				System.out.println("└───────────────────────────────────────┘");
			}else if(fa == 2) {
				System.out.println("┌──────────────────전투──────────────────┐");
				System.out.println("\t1.공격\t\t   2.도망간다\n\t3.없음\t\t   4.없어용");
				System.out.println("└───────────────────────────────────────┘");
			}else if(fa == 3) {
				System.out.println("┌──────────────────전투──────────────────┐");
				System.out.println("     "+"1."+sr.att1()+"\t   "+"2."+sr.att2()+"   \n     "+"3."+sr.att3()+"\t "+"4.뒤로가기");
				System.out.println("└───────────────────────────────────────┘");
			}
			System.out.print("   메뉴 >");
			Integer menu = sc.nextInt();

			if (menu == 1) {
				if (Startmenu == null && fa == 0) {
					Startmenu = sr.newgame();
				} else if (Startmenu == 1 && fa == 0) {
					fa = sr.See();
				} else if (fa == 1) {
					fa = sr.move();
				} else if (fa == 2) {
					sr.famenu();
					fa = 3;
				} else if (fa == 3) {
					sr.fatt1();
					sr.famenu();
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
					fa = 0;
				} else if( fa == 2) {
					System.out.println("   겁쟁이");
					fa = 0;
				}else if (fa == 3) {
					sr.famenu();
					sr.fatt2();
				}
			} else if (menu == 3) {
				if (Startmenu == null && fa == 0) {

				} else if (Startmenu == 1 && fa == 0) {
//				sr.character();
				}else if (fa == 3) {
					sr.famenu();
					sr.fatt3();
				}
			} else if (menu == 4) {
				if (Startmenu == null && fa == 0) {

				} else if (Startmenu == 1 && fa == 0) {
//				sr.shop();
				} else if (fa ==3) {
					fa=2;
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
		System.out.println("시스템을 종료합니다");
	}
}
