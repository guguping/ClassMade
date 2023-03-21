package Made_2;

import java.util.Scanner;

public class gameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer Startmenu = null;
		gameService sr = gameService.getInstance();
		while(true) {
		System.out.println("┌──────────────────넥슨──────────────────┐");
		if(Startmenu == null) {
		System.out.println("\t1.새로하기 2.이어하기 0.종료");
		}else if(Startmenu == 1) {
		System.out.println("\t1.맵 2.전진 3.상태창 4.상점");
		}else if(Startmenu == 2) {
		System.out.println("gm메뉴 아직 없음");
		}
		System.out.print("   메뉴 >");
		Integer menu = sc.nextInt();
		
		
		if(menu == 1) {
			if(Startmenu == null) {
				sr.newgame();
				Startmenu = 1;
			}else if(Startmenu == 1) {
//				gameService.Map();
			}
		}else if(menu == 2) {
			if(Startmenu == null) {
				
			}else if(Startmenu == 1){
//				gameService.loadgame();
			}
		}else if(menu == 3 ) {
			if(Startmenu == null) {
				
			}else if(Startmenu == 1){
//				gameService.character();
			}
		}else if(menu == 4) {
			if(Startmenu == null) {
				
			}else if(Startmenu == 1) {
//				gameService.shop();
			}
		}else if(menu == 0 ) {
			break;
		}else if(menu == 960220) {
			Startmenu = 2;
			System.out.println("어케알았누 ?");
		}
		}
		System.out.println("시스템을 종료합니다");
	}
}
